Given a calculator

When set arguments to 10.5 and 5
Then adding should return 15.5
Then subtracting should return 5.5
Then multiplying should return 52.5
Then division should return 2.1
Then greater should return true

When set arguments to -2.5 and 5
Then adding should return 2.5
Then subtracting should return -7.5
Then multiplying should return -12.5
Then division should return -0.5
Then greater should return false

When set arguments to 6.4 and 0
Then adding should return 6.4
Then subtracting should return 6.4
Then multiplying should return 0
Then division should return 0
Then greater should return true

When set arguments to 0 and -2.9
Then adding should return -2.9
Then subtracting should return 2.9
Then multiplying should return 0
Then division should return 0
Then greater should return true

