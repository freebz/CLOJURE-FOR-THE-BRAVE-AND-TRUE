(require '[clojure.string :as s])
(defn clean
  [text]
  (s/replace (s/trim) #"lol" "LOL"))
(clean "My boa constrictor is so sassy lol!   ")
; => "My boa constrictor is so sassy LOL!"
