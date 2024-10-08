(ns problem-6.modular)

(defn square [n] (* n n))
(defn sum_square_difference [n]
  (let [data (take n (iterate inc 1))]
    (- (square (reduce + data)) (reduce + (map square data)))))