class Solution:
    def binaryGap(self, N: 'int') -> 'int':
        blist = list(bin(N).split("b")[1])
        indexList = []
        pre = dist = 0
        for i, c in enumerate(blist):
            if c == "1":
                dist = max(dist, i - pre)
                pre = i
        return dist


def main():
    print(Solution().binaryGap(22))
    # Output: 2
    # Explanation:
    #     22 in binary is 0b10110.
    #     In the binary representation of 22, there are three ones, and two consecutive pairs of 1's.
    #     The first consecutive pair of 1's have distance 2.
    #     The second consecutive pair of 1's have distance 1.
    #     The answer is the largest of these two distances, which is 2.

    print(Solution().binaryGap(5))
    # Output: 2
    # Explanation:
    #   5 in binary is 0b101.
    #

    print(Solution().binaryGap(6))
    # Output: 1
    # Explanation:
    # 6 in binary is 0b110.

    print(Solution().binaryGap(8))
    # Output: 0
    # Explanation:
    # 8 in binary is 0b1000.
    # There aren't any consecutive pairs of 1's in the binary representation of 8, so we return 0.
if __name__ == '__main__':
    main()
