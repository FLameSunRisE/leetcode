from typing import List


class Solution:
    def climbStairs(self, n: int) -> int:
        memo = {}
        memo[1] = 1
        memo[2] = 2

        def climb(n):
            if n in memo:  # if the recurssion already done before first take a look-up in the look-up table
                return memo[n]
            else:   # Store the recurssion function in the look-up table and reuturn the stored look-up table function
                memo[n] = climb(n-1) + climb(n-2)
                return memo[n]

        return climb(n)


def main():
    # Example:1
    n = 2
    print(Solution().climbStairs(n))
    # Input: n = 2
    # Output: 2
    # Explanation: There are two ways to climb to the top.
    # 1. 1 step + 1 step
    # 2. 2 steps
    print('------------------------------')
    # Example:2
    n = 3
    print(Solution().climbStairs(n))
    # Input: n = 3
    # Output: 3
    # Explanation: There are three ways to climb to the top.
    # 1. 1 step + 1 step + 1 step
    # 2. 1 step + 2 steps
    # 3. 2 steps + 1 step
    print('------------------------------')


if __name__ == '__main__':
    main()
