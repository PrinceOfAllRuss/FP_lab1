(ns problem-6.modular)

(defn square [n] (* n n))
(defn sum_square_difference []
  (let [data (take 100 (iterate inc 1))]
    (- (square (reduce + data)) (reduce + (map square data)))))