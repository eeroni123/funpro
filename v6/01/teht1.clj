(def lampotilat15 [-7.5 -9.6 13.5 17.1 21.7 25.4 31.4 27.8 22.0 18.0 14.3 -11.3])
(def lampotilat16 [-6.5 -5.3 12.8 19.8 27.7 28.6 29.1 26.1 23.2 16.2 -8.5 -9.1])

;keskiarvot
(def karvot (into [] (map (fn [x y] (/ (+ x y) 2)) lampotilat15 lampotilat16)))
(println karvot)

;positiiviset
(def positiiviset (filter pos? karvot))
(println positiiviset)

;keskilampötila
(def keskilampo (/ (reduce + positiiviset) (count positiiviset)))
(println keskilampo)