(ns problem-25.tail)

(defn len [n] (count (str n)))
(defn thousand-digit_fibonacci_number
  ([length] (thousand-digit_fibonacci_number 1M 1M 3 length))
  ([a b index length]
   (if (= (len (+ a b)) length)
     index
     (recur b (+ a b) (inc index) length))))