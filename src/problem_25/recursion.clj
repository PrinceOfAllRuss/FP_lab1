(ns problem-25.recursion)

(defn len [n] (count (str n)))
(defn thousand-digit_fibonacci_number
  ([length] (thousand-digit_fibonacci_number 1M 1M length))
  ([a b length]
   (if (= (len (+ a b)) length)
     3
     (+ 1 (thousand-digit_fibonacci_number b (+ a b) length)))))