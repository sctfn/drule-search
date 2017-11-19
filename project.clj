(defproject drule-search "0.1.0-SNAPSHOT"
  :description "Perform D-rule unification to search for short proofs"
  :url "http://github.com/sctfn/drule-search"
  :license {:name "MIT License"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot drule-search.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
