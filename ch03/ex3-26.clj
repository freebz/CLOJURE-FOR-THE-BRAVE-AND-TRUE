;; Functions

;; Calling Functions

(+ 1 2 3 4)
(* 1 2 3 4)
(first [1 2 3 4])


(or + -)
; => #function[clojure.core/+]


((or + -) 1 2 3)
; => 6


((and (= 1 1) +) 1 2 3)
; => 6

((first [+ 0]) 1 2 3)
; => 6


(1 2 3 4)
("test" 1 2 3)
; ClassCastException java.lang.String (in module: java.base) cannot be cast to clojure.lang.IFn (in module: Unnamed Module)  user/eval4841 (form-init7982463883780131942.clj:146)


(inc 1.1)
; => 2.1

(map inc [0 1 2 3])
; => (1 2 3 4)


(+ (inc 199) (/ 100 (- 7 2)))
(+ 200 (/ 100 (- 7 2))) ; evaluated "(inc 199)"
(+ 200 (/ 100 5)) ; evaluated (- 7 2)
(+ 200 20) ; evaluated (/ 100 5)
220 ; final evaluation
