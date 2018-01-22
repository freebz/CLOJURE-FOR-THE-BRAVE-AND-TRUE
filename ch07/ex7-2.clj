;; An Overview of Clojure's Evaluation Model

(def addition-list (list + 1 2))
(eval addition-list)
; => 3



(eval (concat addition-list [10]))
; => 13

(eval (list 'def 'lucky-number (concat addition-list [10])))
; => #'user/lucky-number

lucky-number
; => 13
