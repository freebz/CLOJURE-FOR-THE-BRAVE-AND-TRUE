;; Lazy Seqs

;; Demonstrating Lazy Seq Efficiency

(def vampire-database
  {0 {:makes-blood-puns? false, :has-pulse? true  :name "McFishwich"}
   1 {:makes-blood-puns? false, :has-pulse? true  :name "McMackson"}
   2 {:makes-blood-puns? true,  :has-pulse? false :name "Damon Salvatore"}
   3 {:makes-blood-puns? true,  :has-pulse? true  :name "Mickey Mouse"}})

(defn vampire-related-details
  [social-security-number]
  (Thread/sleep 1000)
  (get vampire-database social-security-number))

(defn vampire?
  [record]
  (and (:makes-blood-puns? record)
       (not (:has-pulse? record))
       record))

(defn identify-vampire
  [social-security-numbers]
  (first (filter vampire?
                 (map vampire-related-details social-security-numbers))))



(time (vampire-related-details 0))
; => "Elapsed time: 1000.49519 msecs"
; => {:makes-blood-puns? false, :has-pulse? true, :name "McFishwich"}



(time (def mapped-details (map vampire-related-details (range 0 1000000))))
; => "Elapsed time: 0.21588 msecs"
; => #'user/mapped-details



(time (first mapped-details))
; => "Elapsed time: 32004.857804 msecs"
; => {:makes-blood-puns? false, :has-pulse? true, :name "McFishwich"}
