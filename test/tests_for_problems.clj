(ns tests_for_problems
  (:require [clojure.test :refer [deftest is]]
            [problem-6.loop :as loop]
            [problem-6.modular :as modular]
            [problem-25.lazy :as lazy]
            [problem-25.recursion :as recursion]
            [problem-25.tail :as tail]))

(deftest test-problem-6-loop-with-100
  (is (= (loop/sum_square_difference 100) 25164150)))
(deftest test-problem-6-loop-with-10
  (is (= (loop/sum_square_difference 10) 2640)))

(deftest test-problem-6-modular-with-100
  (is (= (modular/sum_square_difference 100) 25164150)))
(deftest test-problem-6-modular-with-10
  (is (= (modular/sum_square_difference 10) 2640)))

(deftest test-problem-25-lazy-with-1000
  (is (= (lazy/thousand-digit_fibonacci_number 1000) 4782)))
(deftest test-problem-25-lazy-with-3
  (is (= (lazy/thousand-digit_fibonacci_number 3) 12)))

(deftest test-problem-25-recursion-with-100
  (is (= (recursion/thousand-digit_fibonacci_number 100) 476)))
(deftest test-problem-25-recursion-with-3
  (is (= (recursion/thousand-digit_fibonacci_number 3) 12)))

(deftest test-problem-25-tail-with-1000
  (is (= (tail/thousand-digit_fibonacci_number 1000) 4782)))
(deftest test-problem-25-tail-with-3
  (is (= (tail/thousand-digit_fibonacci_number 3) 12)))