(ns com.nomad.doppler.thrift-setup
  (import [org.apache.thrift7.protocol TBinaryProtocol TProtocol]
          [backtype.storm.generated Nimbus$Client]
          [org.apache.thrift7.transport TTransport TFramedTransport TSocket TTransportException]))

(defn setup-thrift-connection
  [hostname]
  (let [transport (TFramedTransport. (TSocket. hostname 6627))
        protocol (TBinaryProtocol. transport)
        client (Nimbus$Client. protocol)]
    (.open transport)
    [client transport]))
