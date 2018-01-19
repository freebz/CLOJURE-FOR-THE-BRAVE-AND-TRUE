;; The ns Macro

(ns the-divine-cheese-code.core
  (:refer-clojure :exclude [println]))



(in-ns 'the-divine-cheese-code.core)
(refer 'clojure.core :exclude ['println])



(ns the-divine-cheese-code.core
  (:require the-divine-cheese-code.visualization.svg))



(in-ns 'the-divine-cheese-code.core)
(require 'the-divine-cheese-code.visualization.svg)



(ns the-divine-cheese-code.core
  (:require [the-divine-cheese-code.visualization.svg :as svg]))



(in-ns 'the-divine-cheese-code.core)
(require ['the-divine-cheese-code.visualization.svg :as 'svg])



(ns the-divine-cheese-code.core
  (:require [the-divine-cheese-code.visualization.svg :as svg]
            [clojure.java.browse :as browse]))



(in-ns 'the-divine-cheese-code.core)
(require ['the-divine-cheese-code.visualization.svg :as 'svg])
(require ['clojure.java.browse :as 'browse])



(ns the-divine-cheese-code.core
  (:require [the-divine-cheese-code.visualization.svg :refer [points]]))



(in-ns 'the-divine-cheese-code.core)
(require 'the-divine-cheese-code.visualization.svg)
(refer 'the-divine-cheese-code.visualization.svg :only ['points])



(ns the-divine-cheese-code.core
  (:require [the-divine-cheese-code.visualization.svg :refer :all]))



(in-ns 'the-divine-cheese-code.core)
(require 'the-divine-cheese-code.visualization.svg)
(refer 'the-divine-cheese-code.visualization.svg)



(ns the-divine-cheese-code.core
  (:use clojure.java.browse))



(in-ns 'the-divine-cheese-code.core)
(use 'clojure.java.browse)



(ns the-divine-cheese-code.core
  (:use [clojure.java.browse io]))



(in-ns the-divine-cheese-code.core)
(use 'clojure.java.browse)
(use 'clojure.java.io)
