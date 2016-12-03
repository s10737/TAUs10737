Given a calculator

When set arguments to 4 and 8
Then adding should return 12

When set arguments to 0 and -1.7
Then adding should return -1.7

When set arguments to 2 and -2
Then adding should return 0

When set arguments to 10.3 and 3.2
Then subtracting should return 7.1

When set arguments to 2.5 and 8.2
Then subtracting should return -5.7

When set arguments to 4.5 and 4.5
Then subtracting should return 0

When set arguments to -1.92 and -3.15
Then subtracting should return 1.23

When set arguments to 5 and -3
Then subtracting should return 8

When set arguments to -7 and 2
Then subtracting should return -9

When set arguments to -1.1 and 0
Then subtracting should return -1.1

When set arguments to 3.0 and 5.9
Then multiplying should return 17.7

When set arguments to -1 and 3
Then multiplying should return -3

When set arguments to 3.2 and -3.1
Then multiplying should return -9.92

When set arguments to -2 and -3
Then multiplying should return 6

When set arguments to 2 and 0
Then multiplying should return 0

When set arguments to -6 and 2
Then division should return -3

When set arguments to -2 and -2
Then division should return 1

When set arguments to -3.2 and 0
Then division should return 0

When set arguments to 2.12 and 2.11
Then greater should return true

When set arguments to 4 and -1
Then greater should return true

When set arguments to -1 and 0
Then greater should return false

When set arguments to 2.4 and 0
Then greater should return true

When set arguments to 0.0 and 0.0
Then greater should return false

