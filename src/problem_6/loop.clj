(ns problem-6.loop)

(defn square [n] (* n n))
(defn sum_square_difference [n]
  (loop [a 1
         sum_of_the_squares 0
         square_of_the_sum 0]
    (if ( = a (+ 1 n))
      (- (square square_of_the_sum) sum_of_the_squares)
      (recur (inc a) (+ sum_of_the_squares (square a)) (+ square_of_the_sum a)))))