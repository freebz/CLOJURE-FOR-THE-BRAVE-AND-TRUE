;; Your Project as a Library

(ns-name *ns*)
; => user



inc
; => #function[clojure.core/inc]

'inc
; => incd

(map inc [1 2])
; => (2 3)

'(map inc [1 2])
; => (map inc [1 2])
