(ns read-config
  (:require [aero.core :as aero]
            [clojure.java.io :as io]))

(defn -main
  [& args]
  (aero/read-config (io/resource "config.edn")))

