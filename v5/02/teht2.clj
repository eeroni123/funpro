(let [luku (read-line)
      value (try
              (Integer/parseInt luku)
              (catch NumberFormatException e luku ))]

  (if (<= value 0)
    (recur)
    (if (= 0 (mod value 2))
      (println "Parillinen")
      (println "Ei parillinen")))
  )