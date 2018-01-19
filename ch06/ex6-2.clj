;; Storing Object with def

(def great-books ["East of Eden" "The Glass Bead Game"])
; => #'user/great-books

great-books
; => ["East of Eden" "The Glass Bead Game"]



(ns-interns *ns*)
; => {great-books #'user/great-books}



(get (ns-interns *ns*) 'great-books)
; => #'user/great-books



(deref #'user/great-books)
; => ["East of Eden" "The Glass Bead Game"]



great-books
; => ["East of Eden" "The Glass Bead Game"]



(def great-books ["The Power of Base" "Journey to Upstairs"])
great-books
; => ["The Power of Base" "Journey to Upstairs"]
