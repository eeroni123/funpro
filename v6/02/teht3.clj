(def vampire-database
  {0 {:makes-blood-puns? false, :has-pulse? true  :name "McFishwich"}
   1 {:makes-blood-puns? false, :has-pulse? true  :name "McMackson"}
   2 {:makes-blood-puns? true,  :has-pulse? false :name "Damon Salvatore"}
   3 {:makes-blood-puns? true,  :has-pulse? true  :name "Mickey Mouse"}})

(defn lisaa
  [db mbp hp nimi]
  (assoc db (inc(apply max(keys db))){:makes-blood-puns? mbp :has-pulse? hp :name nimi}))

(lisaa vampire-database true true "Dracula")