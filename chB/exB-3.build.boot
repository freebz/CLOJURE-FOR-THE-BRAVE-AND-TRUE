;; Handlers and Middleware

(def strinc (comp str inc))
(strinc 3)
; => "4"



(defn whiney-str
  [rejects]
  {:pre [(set? rejects)]}
  (fn [x]
    (if (rejects x)
      (str "I don't like " x)
      (str x))))

(def whiney-strinc (comp (whiney-str #{2}) inc))
(whiney-strinc 1)
; => "I don't like 2"
