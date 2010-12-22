;; Solution to Project Euler problem 6
;; http://projecteuler.net/index.php?section=problems&id=6
;;
;; The sum of the squares of the first ten natural numbers is,
;;
;; 1^2 + 2^2 + ... + 10^2 = 385
;; The square of the sum of the first ten natural numbers is,
;;
;; (1 + 2 + ... + 10)^2 = 55^2 = 3025
;;
;; Hence the difference between the sum of the squares of the first ten natural numbers
;; and the square of the sum is 3025 - 385 = 2640.
;;
;; Find the difference between the sum of the squares of the first one hundred natural
;; numbers and the square of the sum.
(defn sum-squares
  "The sum of 1^2 + 2^2 + ... + n^2"
  [n]
  (* n (+ n 1) (/ (+ (* 2 n) 1) 6)))

(defn sum
  "The sum of 1 + 2 + ... + n"
  [n]
  (/ (* n (+ n 1)) 2))

(defn sqr [n]
  (* n n))

(println
 (- (sqr (sum 100)) (sum-squares 100))) 