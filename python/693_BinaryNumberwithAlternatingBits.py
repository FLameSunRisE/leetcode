class Solution:
    def hasAlternatingBits(self, n: int) -> bool:
        binaryList = list(bin(n).split('b')[1])
        preNum = 0 
        for index in range(0,len(binaryList)):
            print(binaryList[index])
            if index == 0:
                preNum = binaryList[index]
                continue
            if binaryList[index] != preNum:
                preNum = binaryList[index]
            else: 
                return False
        return True


def main():
    print(Solution().hasAlternatingBits(5))
    # Input: 5
    # Output: True
    # Explanation:
    # The binary representation of 5 is: 101

    print(Solution().hasAlternatingBits(7))
    # Input: 7
    # Output: False
    # Explanation:
    # The binary representation of 7 is: 111.

    print(Solution().hasAlternatingBits(11))
    # Input: 11
    # Output: False
    # Explanation:
    # The binary representation of 11 is: 1011.

    print(Solution().hasAlternatingBits(10))
    # Input: 10
    # Output: True
    # Explanation:
    # The binary representation of 10 is: 1010.


if __name__ == '__main__':
    main()