;; Anonymous Functions

(fn [param-list]
  function body)


(map (fn [name] (str "Hi, " name))
     ["Darth Vader" "Mr. Magoo"])
; => ("Hi, Darth Vader" "Hi, Mr. Magoo")

((fn [x] (* x 3)) 8)
; => 24


(def my-special-multiplier (fn [x] (* x 3)))
(my-special-multiplier 12)
; => 36


#(* % 3)


(#(* % 3) 8)
; => 24


(map #(str "Hi, " %)
     ["Darth Vader" "Mr. Magoo"])
; => ("Hi, Darth Vader" "Hi, Mr. Magoo")


;; Function call
(* 8 3)

;; Anonymous function
#(* % 3)


(#(str %1 " and " %2) "cornbread" "butter beans")
; => "cornbread and butter beans"


(#(identity %&) 1 "blarg" :yip)
; => (1 "blarg" :yip)
