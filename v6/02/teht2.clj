(def vektori [[1 2 3][4 5 6][6 7 8]])

;a
(defn minimi
  [v]
  (map #(apply min %) v))

(println (minimi vektori))

;b
(def minimivektori
  (vec (minimi vektori)))

(println minimivektori)