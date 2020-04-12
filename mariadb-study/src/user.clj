;; cf. https://github.com/weavejester/ragtime/wiki/Getting-Started
(ns user
  (:require [ragtime.jdbc :as jdbc]))

;; cf. https://github.com/clojure/java.jdbc#example-usage
(def mysql-db {:dbtype "mysql"
               :dbname "exercise"
               :user "user"
               :password "user"
               :host "localhost"
               :port 3307})

(def config
  {:datastore  (jdbc/sql-database mysql-db)
   :migrations (jdbc/load-resources "migrations")})
