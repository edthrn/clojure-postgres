(defproject postgres-adapter "0.1.0"
  :description "A simple interface between Clojure and a PostgreSQL database."
  :url "https://github.com/edthrn/clojure-postgres"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/java.jdbc "0.7.12"]
                 [org.postgresql/postgresql "42.2.9"]
                 [honeysql "1.0.444"]]
  :main ^:skip-aot postgres-adapter.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
