(ns problem-25.recursion)

(defn len [n] (count (str n)))
(defn thousand-digit_fibonacci_number [a b acc length]
  (if (= (len acc) length)
    2
    (+ 1 (thousand-digit_fibonacci_number b (+ a b) (+ a b) length))))