;; into

(map identity {:sunlight-reaction "Glitter!"})
; => ([:sunlight-reaction "Glitter!"])

(into {} (map identity {:sunlight-reaction "Glitter!"}))
; => {:sunlight-reaction "Glitter!"}



(map identity [:garlic :sesame-oil :fried-eggs])
; => (:garlic :sesame-oil :fried-eggs)

(into [] (map identity [:garlic :sesame-oil :fried-eggs]))
; => [:garlic :sesame-oil :fried-eggs]



(map identity [:garlic-clove :garlic-clove])
; => (:garlic-clove :garlic-clove)

(into #{} (map identity [:garlic-clove :garlic-clove]))
; => #{:garlic-clove}



(into {:favorite-emotion "gloomy"} [[:sunlight-rection "Glitter!"]])
; => {:favorite-emotion "gloomy", :sunlight-rection "Glitter!"}

(into ["cherry"] '("pine" "spruce"))
; => ["cherry" "pine" "spruce"]



(into {:favorite-animal "kitty"} {:least-favorite-smell "dog"
                                  :relationship-with-teenager "creepy"})
; => {:favorite-animal "kitty"
;     :relationship-with-teenager "creepy"
;     :least-favorite-smell "dog"}
