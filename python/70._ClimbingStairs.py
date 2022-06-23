from typing import List


class Solution:
    def climbStairs(self, n: int) -> int:


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
