(defn syt [p q]
  (if (zero? q)
    p
    (recur q (mod p q))))


(syt 102 68)