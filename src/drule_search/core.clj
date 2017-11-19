(ns drule-search.core
  (:gen-class))

(defn map-wff [f wff]
  "Apply f to all variables in wff"
  (def mw [w]
    (if (number? w)
      (f w)
      (cons (first w) (map mw (rest w)))))
  (mw wff))

(defn maxvar [wff]
  "Find the maximum variable number used in a wff"
  (if (number? wff) wff (apply max (map maxvar (rest wff)))))

(defn boostvar [wff n]
  "Boost all variables used in wff by n"
  (map-wff (fn [w] (+ w n)) wff))

(defn make-subst [wff subs]
  "Apply the substitutions in subs to wff"
  (map-wff (fn [w] (get subs w w)) wff))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
