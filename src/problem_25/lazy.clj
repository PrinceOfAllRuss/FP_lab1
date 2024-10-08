(ns problem-25.lazy)

(defn len [n] (count (str n)))
(defn fib
  ([] (concat [1M 1M] (fib 1M 1M)))
  ([a b]
   (let [n (+ a b)]
     (lazy-seq (cons n (fib b n))))))
(defn thousand-digit_fibonacci_number [length]
  (+ 1 (count (take-while #(< (len %) length) (fib)))))
