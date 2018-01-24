;; Building Lists for Evaluation

;; Distinguishing Symbols and Values

(let [result expression]
  (println result)
  result)



(defmacro my-print-whoopsie
  [expression]
  (list let [result expression]
        (list println result)
        result))



(defmacro my-print
  [expression]
  (list 'let ['result expression]
        (list 'println 'result)
        'result))
