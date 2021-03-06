;; loop

(loop [iteration 0]
  (println (str "Iteration " iteration))
  (if (> iteration 3)
    (println "goodbye!")
    (recur (inc iteration))))
; => Iteration 0
; => Iteration 1
; => Iteration 2
; => Iteration 3
; => Iteration 4
; => goodbye!


(defn recursive-printer
  ([]
   (recursive-printer 0))
  ([iteration]
   (println (str "Iteration " iteration))
   (if (> iteration 3)
     (println "Goodbye!")
     (recursive-printer (inc iteration)))))
(recursive-printer)
; => Iteration 0
; => Iteration 1
; => Iteration 2
; => Iteration 3
; => Iteration 4
; => goodbye!
