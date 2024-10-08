(ns problem-6.loop)

(defn square [n] (* n n))

(defn sum_square_difference []
  (loop [a 1 sum_of_the_squares 0 square_of_the_sum 0]
    (if ( = a 101)
      (do
       (println (- (square square_of_the_sum) sum_of_the_squares))
       (- (square square_of_the_sum) sum_of_the_squares))
      (recur (inc a) (+ sum_of_the_squares (square a)) (+ square_of_the_sum a)))))

(sum_square_difference)