(ns com.nomad.doppler.storm-services
  (:require [com.nomad.doppler.connection-cache :as conn-cache]
            [clojure.core.cache :as cache])
  (import [backtype.storm.generated Nimbus Nimbus$Client KillOptions]))

;;Function to return acks from spout
;;Function to return fail from spout
;;Function to return emits from spout
;;Function to returns latency of spout

(defn- get-topology-id
  [nimbus topology]
  (.get_id (first (filter (fn [topo] (= (.get_name topo) topology))
                          (.get_topologies (.getClusterInfo nimbus))))))

(defn get-spout-acks
  [hostname topology spout]
  (let [nimbus (conn-cache/get-connection hostname)
        topo-id (get-topology-id nimbus topology)]
    (get
      (get
        (.get_acked
          (.get_spout
            (.get_specific
              (.get_stats
                (first
                  (filter (fn [component] (= (.get_component_id component) spout))
                          (.get_executors (.getTopologyInfo nimbus topo-id)))))))) ":all-time") "default")))
