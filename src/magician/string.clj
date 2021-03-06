;;;; Magician's extensions to the String class.

(ns magician.string
  (:require [clojure.string]))

(defn palindrome?
  "Returns true if a string is a palindrome.

  A palindrome string is the same forward and backward."
  [string]
  (= string (clojure.string/reverse string)))

