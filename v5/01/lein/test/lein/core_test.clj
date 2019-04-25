(ns lein.core-test
  (:use lein.core)
  (:use  midje.sweet))



(defn square [x] (* x x))


(defn karkausvuosi?
  [vuosi]
  (cond (zero? (mod vuosi 400)) true
        (zero? (mod vuosi 100)) false
        (zero? (mod vuosi 4)) true
        :default false))



(facts "square tehtävä 4"
       (square 2) => 4
       (square 7) => 49
       (square -3) => 9)

(tabular "karkausvuosi? tehtävä 5 "
                 (fact
                   (karkausvuosi? ?vuosi) => ?expected)
                 ?vuosi   ?expected
                 100     false
                 200     false
                 400     true
                 800     true
                 2000    true
                 2200    false
                 12      true
                 20      true
                 15      false
                 1913    false)
