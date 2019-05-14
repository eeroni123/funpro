(defn allekirjoitus [tervehdys vastnottaja] (println tervehdys vastnottaja))

(def muodollinen (partial allekirjoitus "Ystävällisin Terveisin,"))
(def epamuodollinen (partial allekirjoitus "Kuulemiin,"))
(def suomeksi (partial allekirjoitus "Terveisin,"))
(def englanniksi (partial allekirjoitus "Sincerely,"))

(muodollinen "Kalle")
(epamuodollinen "Kalle")
(suomeksi "Kalle")
(englanniksi "Kalle")


