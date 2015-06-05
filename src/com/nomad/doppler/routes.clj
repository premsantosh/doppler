(ns com.nomad.doppler.routes
  (:import (java.io FileNotFoundException))
  (:require [compojure.handler :as handler]
            [compojure.core :as compcore]
            [clojure.data.json :as json]
            [compojure.route :as route]
            [ring.util.response :as resp]
            [com.nomad.doppler.storm-services :as storm])
  (:use [clojure.tools.logging :only (error)]))

(defn- wrap-exception
  "Executes the given function as part of a ring request, returns the functions output. If an exception occurs, a json
  structure representing the error message will be returned instead."
  [f]
  (fn [request]
    (try (f request)
         (catch FileNotFoundException fnfe
                (error fnfe)
                (.printStackTrace fnfe)
                {:status 404
                 :headers {"Content-Type" "application/json"
                           "Accept" "application/json" }
                 :body   (json/write-str {:error {:message (.getMessage fnfe)}})})
         (catch Throwable e
                (error e)
                (.printStackTrace e)
                {:status 500
                 :headers {"Content-Type" "application/json"
                           "Accept" "application/json" }
                 :body   (json/write-str {:error {:message (.getMessage e)}})}))))

(defn- json-response
  [response & [status]]
  (json/write-str {:status (or status 200)
                   :headers {"Content-Type" "application/json"
                             "Accept" "application/json"}
                   :body response}))

(compcore/defroutes routes
                    (compcore/GET "/" [] (resp/resource-response "index.html" {:root "public"}))
                    (route/resources "/")
                    (compcore/GET ["/spout/emits"] [nimbus topology spout] (json-response "Foo Bar"))
                    (compcore/GET ["/spout/acks"] [nimbus topology spout] (json-response (storm/get-spout-acks nimbus topology spout)))
                    (compcore/GET ["/spout/failed"] [nimbus topology spout] (json-response "Foo Bar"))
                    (compcore/GET ["/spout/latency"] [nimbus topology spout] (json-response "Foo Bar"))
                    (compcore/ANY "*" [] (route/not-found (json/write-str {:error {:message "Invalid Request"}}))))
(defn def-routes
  []
  (handler/api (wrap-exception routes)))
