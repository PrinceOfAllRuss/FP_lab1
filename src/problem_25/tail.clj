(ns problem-25.tail)

(defn len [n] (count (str n)))
(defn thousand-digit_fibonacci_number [a b acc index]
  (if (= (len acc) 1000)
    (do
      (println index)
      ;(println "Result")
      ;(println (str "number: " acc ", index: " index ", acc len: " (len acc)))
      index)
    (recur b (+ a b) (+ a b) (inc index))))
    ;(do
    ;  (println (str "number: " acc ", index: " index ", acc len: " (len acc)))
    ;  (recur b (+ a b) (+ a b) (inc index)))))

(thousand-digit_fibonacci_number 1M 1M 0M 2)