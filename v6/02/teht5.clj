(def sima
  [{:aines "Vesi", :yksikko "litraa", :maara 4}
   {:aines "Sokeri", :yksikko "grammaa", :maara 500}
   {:aines "Sitruuna", :yksikko "kpl", :maara 2}
   {:aines "Hiiva", :yksikko "grammaa", :maara 1}])

(def uusisima (fn [kertoma](map #(update % :maara * kertoma) sima)))

(println (uusisima 2))
(println (uusisima 4))
(println (uusisima 6))