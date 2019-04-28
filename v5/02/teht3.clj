(defn kolmellaJaolliset [ylaraja]
  (loop [x 1]
    (when (<= x ylaraja)
      (if (= 0 (rem x 3))
        (println x)
        )
      (recur (inc x)))))

(kolmellaJaolliset 456)