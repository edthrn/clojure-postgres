(ns postgres-adapter.core
  (:require [clojure.java.jdbc :as jdbc]
            [honeysql.core :as sql])
  (:gen-class))

(defn getenv 
  ([env-name] (getenv env-name nil))
  ([env-name default] (or (System/getenv env-name) default)))

(def db {:dbtype "postgresql"
         :dbname (getenv "DB_NAME" "postgres")
         :host (getenv "DB_HOST" "localhost")
         :port (getenv "DB_PORT" "5432")
         :user (getenv "DB_USER" "postgres")
         :password (getenv "DB_PASSWORD")})

(defn execute [stmt] (jdbc/query db (sql/format stmt)))
