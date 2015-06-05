(defproject com.nomad/doppler "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/tools.logging "0.2.6"]
                 [compojure "1.1.8"]
                 [ring "1.3.0"]
                 [org.slf4j/slf4j-api "1.7.5"]
                 [storm/libthrift7 "0.7.0-2" :exclusions [org.slf4j/slf4j-api]]
                 [org.clojure/core.cache "0.6.3"]
                 [org.clojure/data.json "0.2.5"]
                 [org.slf4j/slf4j-log4j12 "1.7.5"]]
  :plugins [[lein-ring "0.8.11"]]
  :resource-paths ["resources"]
  :java-source-paths ["src/backtype/storm/generated"]
  :main com.nomad.doppler.core
  :aot [com.nomad.doppler.core com.nomad.doppler.thrift-setup com.nomad.doppler.connection-cache]
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})
