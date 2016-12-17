Given a calculator

When set arguments to 10 and 5
Then adding should return 15
Then subtracting should return 5
Then multiplying should return 50
Then division should return 2
Then greater should return true

When set arguments to -3 and 1
Then adding should return -2
Then subtracting should return -4
Then multiplying should return -3
Then division should return -3
Then greater should return false

When set arguments to -2 and -4
Then adding should return -6
Then subtracting should return 2
Then multiplying should return 8
Then division should return 0
Then greater should return true

When set arguments to 216 and 0
Then adding should return 216
Then subtracting should return 216
Then multiplying should return 0
Then division should return 0
Then greater should return true

When set arguments to 0 and 0
Then adding should return 0
Then subtracting should return 0
Then multiplying should return 0
Then division should return 0
Then greater should return false