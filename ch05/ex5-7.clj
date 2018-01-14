;; Cool Things to Do with Pure Functions

;; comp

((comp inc *) 2 3)
; => 7



(def character
  {:name "Smooches McCutes"
   :attributes {:intelligence 10
                :strength 4
                :dexterity 5}})
(def c-int (comp :intelligence :attributes))
(def c-str (comp :strength :attributes))
(def c-dex (comp :dexterity :attributes))

(c-int character)
; => 10
(c-str character)
; => 4

(c-dex character)
; => 5



(fn [c] (:strength (:attributes c)))



(defn spell-slots
  [char]
  (int (inc (/ (c-int char) 2))))

(spell-slots character)
; => 6



(def spell-slots-comp (comp int inc #(/ % 2) c-int))



(defn two-comp
  [f g]
  (fn [& args]
    (f (apply g args))))
