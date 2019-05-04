(def food-journal
  [{:kk 3 :paiva 1 :neste 5.3 :vesi 2.0}
   {:kk 3 :paiva 2 :neste 5.1 :vesi 3.0}
   {:kk 3 :paiva 13 :neste 4.9 :vesi 2.0}
   {:kk 4 :paiva 5 :neste 5.0 :vesi 2.0}
   {:kk 4 :paiva 10 :neste 4.2 :vesi 2.5}
   {:kk 4 :paiva 15 :neste 4.0 :vesi 2.8}
   {:kk 4 :paiva 29 :neste 3.7 :vesi 2.0}
   {:kk 4 :paiva 30 :neste 3.7 :vesi 1.0}])

(def kulutus (reduce + (map (fn [x] (if (= (get x :kk) 4) (- (get x :neste) (get x :vesi)) 0)) food-journal)))
(println kulutus)



