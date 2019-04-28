;lottonumerot
((fn []
   (loop [x 0
          result #{}]
     (if (< (count result) 7)
       (recur
         (inc x)
         (conj result (+ 1 (rand-int 39))))
       (println result)))
   )
  )