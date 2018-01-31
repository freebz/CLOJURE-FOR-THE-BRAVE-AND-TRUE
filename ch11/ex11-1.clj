;; Getting Started with Processes

(def echo-chan (chan))
(go (println (<! echo-chan)))
(>!! echo-chan "ketchup")
; => true
; => ketchup



(>!! (chan) "mustard")
