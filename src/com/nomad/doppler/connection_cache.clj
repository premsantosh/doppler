(ns com.nomad.doppler.connection-cache
  (:require [clojure.core.cache :as cache]
            [com.nomad.doppler.thrift-setup :as thrift]))

(def conn-cache (cache/fifo-cache-factory {}))

(defn- load-cache
  [hostname]
  (let [conn (thrift/setup-thrift-connection hostname)]
    (if (cache/has? conn-cache conn)
      (cache/hit conn-cache conn)
      (cache/miss conn-cache hostname conn))))

(defn get-connection
  [hostname]
  (first (second (first (cache/hit (load-cache hostname) hostname)))))

