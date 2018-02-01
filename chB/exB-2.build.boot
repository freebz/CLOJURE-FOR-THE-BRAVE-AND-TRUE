;; The REPL

(fire "-t" "NBA Jam guy")
; My NBA Jam juy is on fire!
; => nil



(fire :thing "NBA Jam guy")
; My NBA Jam guy is on fire!
; => nil



(fire "-p" "-t" "NBA Jam guys")
; My NBA Jam guys are on fire!
; => nil

(fire :pluralize true :thing "NBA Jam guys")
; My NBA Jam guys are on fire!
; => nil
