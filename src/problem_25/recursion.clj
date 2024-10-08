(ns problem-25.recursion)

(defn len [n] (count (str n)))
(defn thousand-digit_fibonacci_number [a b acc]
  (if (= (len acc) 100)
    (do
      ;(println "Result")
      ;(println (str "number: " acc ", acc len: " (len acc)))
        2)
    (+ 1 (thousand-digit_fibonacci_number b (+ a b) (+ a b)))))
;(do
;  (println (str "number: " acc ", index: " index ", acc len: " (len acc)))
;  (recur b (+ a b) (+ a b) (inc index)))))

(println (thousand-digit_fibonacci_number 1M 1M 0M))
(thousand-digit_fibonacci_number 1M 1M 0M)