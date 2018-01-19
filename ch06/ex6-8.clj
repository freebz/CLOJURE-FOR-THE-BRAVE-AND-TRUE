;; To Catch a Burglar

(zipmap [:a :b] [1 2])
; => {:a 1, :b 2}



(merge-with - {:lat 50 :lng 10} {:lat 5 :lng 5})
; => {:lat 45, :lng 5}
