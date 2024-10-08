(ns problem-6.modular)

(defn square [n] (* n n))

;(def data (take 100 (iterate inc 1)))
(defn sum_square_difference []
  (let [data (take 100 (iterate inc 1))]
    (- (square (reduce + 0 data)) (reduce + (map square data)))))
(println (sum_square_difference))