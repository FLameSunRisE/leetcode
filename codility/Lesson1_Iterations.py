# 1.1. For loops
# prints every integer from 0 to 99:
list = []
for i in range(100):
    list.append(i)
print(list)

# Factorial
print('Factorial---------------------')
FactorialList = []
factorial = 1
n = 5
for i in range(1, n+1):
    factorial *= i
    FactorialList.append(factorial)
print('FactorialList : '+str(FactorialList))


# Example: Let’s print a triangle made of asterisks(‘*’) separated by spaces. The triangle
# should consist of n rows, where n is a given positive integer, and consecutive rows should
# contain 1, 2, . . ., n asterisks. For example, for n = 4 the triangle should appear as follows:
# *
# * *
# * * *
# * * * *
# We need to use two loops, one inside the other: the outer loop should print one row in
# each step and the inner loop should print one asterisk in each step2

print('金字塔---------------------')
n = 5
for i in (1, n+1):
    for j in range(i):
        print(j * '*')


# The range function can also accept one more argument specifying the step with which the
# iterated values progress. More formally, range(start, stop, step) is a sequence of
# values beginning with start, whose every consecutive value is increased by step, and that
# contains only values smaller than stop(for positive step or greater than stop for negative
# step). For example, range(10, 0, -1) represents sequence 10, 9, 8, . . ., 1. Note that we
# cannot omit start when we specify step.

# Example: Let’s print a triangle made of asterisks(‘*’) separated by spaces and consisting
# of n rows again, but this time upside down, and make it symmetrical. Consecutive rows should
# contain 2n − 1, 2n − 3, . . ., 3, 1 asterisks and should be indented by 0, 2, 4, . . ., 2(n − 1)
# spaces. For example, for n = 4 the triangle should appear as follows:
# * * * * * * *
# * * * * *
# * * *
# *
# The triangle should have n rows, where n is some given positive integer.
# This time we will use three loops: one outer and two inner loops. The outer loop in
# each step prints one row of the triangle. The first inner loop is responsible for printing the
# indentations, and the second for printing the asterisks.

print('倒金字塔---------------------')
n = 7
j = 0
for i in range(n, 0, -1):
    space = j*' '
    start = (i-j)*'*'
    j += 1
    print(space+start)


# Fibonacci
print('Fibonacci---------------------')
def fibonacci(num):
    a = 0
    b = 1
    while a <= num:
        print(a)
        c = a+b
        a = b
        b = c
        pass
    pass




fibonacci()
