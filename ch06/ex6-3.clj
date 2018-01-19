;; Creating and Switching to Namespaces

(create-ns 'cheese.taxonomy)
; -> #namespace[cheese.taxonomy]



(ns-name (create-ns 'cheese.toxonomy))
; => cheese.toxonomy



(in-ns 'cheese.analysis)
; => #namespace[cheese.analysis]



(in-ns 'cheese.taxonomy)
(def cheddars ["mild" "medium" "strong" "sharp" "extra sharp"])
(in-ns 'cheese.analysis)

cheddars
; => Exception: Unable to resolve symbol: cheddars in this context.



cheese.taxonomy/cheddars
; => ["mild" "medium" "strong" "sharp" "extra sharp"]
