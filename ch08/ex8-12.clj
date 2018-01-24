;; Brews for the Brave and True

;; Validation Functions

(def order-details
  {:name "Mitchard Blimmons"
   :email "michard.blimmonsgmail.com"})



(validate order-details order-details-validations)



(def order-details-validations
  {:name
   ["Please enter a name" not-empty]

   :email
   ["Please enter an email address" not-empty

    "Your email address doesn't look like an eamil address"
    #(or (empty? %) (re-seq #"@" %))]})



(defn error-messages-for
  "Return a seq of error messages"
  [to-validate message-validator-pairs]
  (map first (filter #(not ((second %) to-validate))
                     (partition 2 message-validator-pairs))))



(error-messages-for "" ["Please enter a name" not-empty])
; => ("Please enter a name")




(defn validate
  "Return a map whith a vector of errors for each key"
  [to-validate validations]
  (reduce (fn [errors validation]
            (let [[fieldname validation-check-groups] validation
                  value (get to-validate fieldname)
                  error-messages (error-messages-for value validation-check-groups)]
              (if (empty? error-messages)
                errors
                (assoc errors fieldname error-messages))))
          {}
          validations))

(validate order-details order-details-validations)
; => {:email ("Your email address doesn't look like an eamil address")}
