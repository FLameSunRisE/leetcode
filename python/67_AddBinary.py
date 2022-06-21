from typing import List


class Solution:
    def addBinary(self, a: str, b: str) -> str:
        a = int(a, 2)
        b = int(b, 2)
        return bin(a+b)[2:]


def main():
    # Example:1
    a = "11"
    b = "1"
    print(Solution().addBinary(a,b))
    # Input: a = "11", b = "1"
    # Output: "100"
    print('------------------------------')
    # Example:2
    a = "1010"
    b = "1011"
    print(Solution().addBinary(a,b))
    # Input: a = "1010", b = "1011"
    # Output: "10101"
    print('------------------------------')

if __name__ == '__main__':
    main()
