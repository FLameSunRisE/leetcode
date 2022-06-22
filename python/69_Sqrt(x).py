from typing import List


class Solution:
    def mySqrt(self, x: 'int') -> 'int':
        if x <= 1:
            return x
        l = 1
        r = x
        while l <= r:
            m = l + (r - l) // 2
            if m * m > x:
                r = m - 1
            else:
                l = m + 1
        return r


def main():
    # Example:1
    x = 4
    print(Solution().mySqrt(x))
    # Input: x = 4
    # Output: 2
    print('------------------------------')
    # Example:2
    x = 8
    print(Solution().mySqrt(x))
    # Input: x = 8
    # Output: 2
    # Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
    print('------------------------------')


if __name__ == '__main__':
    main()
