(ns com.nomad.doppler.core
  (:require [compojure.core :refer :all]
            [compojure.handler :as handler]
            [compojure.route :as route]
            [ring.adapter.jetty :as jetty]
            [com.nomad.doppler.routes :as routes])
  (:gen-class))

(defn get-port [args]
  (let [portIdx (.indexOf args "--port")
        portValIdx (+ 1 portIdx)
        portVal (get args portValIdx)]
    (if (= portIdx -1)
      9091
      (Integer/parseInt portVal))))

(defn -main [& args]
  (let [args (or (vec args) [])]
    (jetty/run-jetty (routes/def-routes) {:port (get-port args)})))
