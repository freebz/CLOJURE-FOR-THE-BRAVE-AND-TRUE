;; Vars

;; Dynamic Binding

(def ^:dynamic *notification-address* "dobby@elf.org")



(binding [*notification-address* "test@elf.org"]
  *notification-address*)
; => "test@elf.org"



(binding [*notification-address* "tester-1@elf.org"]
  (println *notification-address*)

  (binding [*notification-address* "tester-2@elf.org"]
    (println *notification-address*))
  (println *notification-address*))
; => tester-1@elf.org
; => tester-2@elf.org
; => tester-1@elf.org
