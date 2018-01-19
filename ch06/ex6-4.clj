;; refer

(in-ns 'cheese.taxonomy)
(def cheddars ["mild" "medium" "strong" "sharp" "extra sharp"])
(def bries ["Wisconsin" "Somerest" "Brie de Meaux" "Brie de Me"])
(in-ns 'cheese.analysis)

(clojure.core/refer 'cheese.taxonomy)
bries
; => ["Wisconsin" "Somerest" "Brie de Meaux" "Brie de Me"]

cheddars
; => ["mild" "medium" "strong" "sharp" "extra sharp"]



(clojure.core/get (clojure.core/ns-map clojure.core/*ns*) 'bries)
; => #'cheese.taxonomy/bries

(clojure.core/get (clojure.core/ns-map clojure.core/*ns*) 'cheddars)
; => #'cheese.taxonomy/cheddars



(clojure.core/refer 'cheese.taxonomy :only ['bries])
bries
; => ["Wisconsin" "Somerest" "Brie de Meaux" "Brie de Me"]
cheddars
; => RuntimeException: Unable to resolve symbol: cheddars



(clojure.core/refer 'cheese.taxonomy :exclude ['bries])
bries
; => RuntimeException: Unable to resolve symbol: bries
cheddars
; => ["mild" "medium" "strong" "sharp" "extra sharp"]



(clojure.core/refer 'cheese.taxonomy :rename {'bries 'yummy-bries})
bries
; => RuntimeException: Unable to resolve symbol: bries
yummy-bries
; => ["Wisconsin" "Somerest" "Brie de Meaux" "Brie de Me"]



(in-ns 'cheese.analysis)
;; Notice the dash after "defn"
(defn- private-function
  "Just an example function that does nothing"
  [])



(in-ns 'cheese.taxonomy)
(clojure.core/refer-clojure)
(cheese.analysis/private-function)
(refer 'cheese.analysis :only ['private-function])
