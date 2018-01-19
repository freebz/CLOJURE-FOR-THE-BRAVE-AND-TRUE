;; Requiring and Using Namespaces

(require '[the-divine-cheese-code.visualization.svg :as svg])


(require 'the-divine-cheese-code.visualization.svg)
(alias 'svg 'the-divine-cheese-code.visualization.svg)



(svg/points heists)
; => "6.97,50.95 8.55,47.37 5.37,43.3 8.55,47.37 12.45,41.9"



(require 'the-divine-cheese-code.visualization.svg)
(refer 'the-divine-cheese-code.visualization.svg)


(use 'the-divine-cheese-code.visualization.svg)



(require 'the-divine-cheese-code.visualization.svg)
(refer 'the-divine-cheese-code.visualization.svg)
(alias 'svg 'the-divine-cheese-code.visualization.svg)



(use '[the-divine-cheese-code.visualization.svg :as svg])
(= svg/points points)
; => true

(= svg/latlng->point latlng->point)
; => true



(require 'the-divine-cheese-code.visualization.svg)
(refer 'the-divine-cheese-code.visualization.svg :as :only ['points])



(use '[the-divine-cheese-code.visualization.svg :as svg :only ['points]])
(refer 'the-divine-cheese-code.visualization.svg :as :only ['points])
(= svg/points points)
; => true

;; We can use the alias to reach latlng->point
svg/latlng->point
; This doesn't throw an exception

;; But we can't use the bare name
latlng->point
; This does throw an exception!
