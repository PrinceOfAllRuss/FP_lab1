(ns problem-25.tail)

(defn len [n] (count (str n)))
(defn thousand-digit_fibonacci_number [a b acc index]
  (if (= (len acc) 1000)
    index
    (recur b (+ a b) (+ a b) (inc index))))