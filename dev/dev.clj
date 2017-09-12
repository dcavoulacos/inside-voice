(ns dev
  (:require [clojure.spec.alpha :as s]))

(def test-invoice
  {

   }
  )

;;------------------------------------------------------------------------------
;; Data Specs
;;------------------------------------------------------------------------------

;; Invoice
(s/def ::invoice-number integer?) ;; auto-increment, to determine how to init
(s/def ::document-title string?)
(s/def ::publish-date pos-int?) ;; might be unnecessary, maybe d/m/y


;; Client
(s/def ::job-name string?)
(s/def ::company string?) (s/def ::producer string?) ;;either or
(s/def ::billing-address string?)
(s/def ::client string?) ;;optional
(s/def ::job-id int?) ;; optional


;; Billables
(s/def ::type string?)
(s/def ::hourly-rate int?)
(s/def ::days-worked coll?) ;; either start-end for range, or vector
                            ;; both of form {:day d :month m :year y}