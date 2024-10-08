(ns problem-25.lazy)

(defn len [n] (count (str n)))
(defn thousand-digit_fibonacci_number [a b acc index]
  (if (= (len acc) 1000)
    (do
      (println index)
      ;(println "Result")
      ;(println (str "number: " acc ", index: " index ", acc len: " (len acc)))
      acc)
    (recur b (+ a b) (+ a b) (inc index))))
;(do
;  (println (str "number: " acc ", index: " index ", acc len: " (len acc)))
;  (recur b (+ a b) (+ a b) (inc index)))))

;(thousand-digit_fibonacci_number 1M 1M 0M 2)

(def fib (map first (iterate (fn [[a b]] [b (+ a b)]) [1 1])))

(def fib2 (iterate (fn [[a b]] [b (+ a b)]) [1 1]))

(println (take 10 fib))