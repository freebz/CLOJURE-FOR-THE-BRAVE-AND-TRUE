;; Maps

{}

{:first-name "Charlie"
 :last-name "McFishwich"}

{"string-key" +}

{:name {:first "John" :middle "Jacob" :last "Jingleheimerschmidt"}}

(hash-map :a 1 :b 2)
; => {:a 1 :b 2}


(get {:a 0 :b 1} :b)
; => 1


(get {:a 0 :b {:c "ho hum"}} :b)
; => {:c "ho hum"}


(get {:a 0 :b 1} :c)
; => nil


(get {:a 0 :b 1} :c "unicorns?")
; => "unicorns?"


(get-in {:a 0 :b {:c "ho hum"}} [:b :c])
; => "ho hum"


({:name "The Human Coffeepot"} :name)
; => "The Human Coffeepot"
