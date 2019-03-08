class Solution(object):
    def fairCandySwap(self, A, B):
        """
        :type A: List[int]
        :type B: List[int]
        :rtype: List[int]
        """
        totalA, totalB, setB = sum(A), sum(B), set(B)
        for v in A:
            if (totalB - totalA)//2 + v in setB:
                return [v, (totalB - totalA)//2 + v]

def main():
    print(Solution().fairCandySwap([1, 1], [2, 2]))
    # Output: [1,2]
    print(Solution().fairCandySwap([1, 2], [2, 3]))
    # Output: [1,2]


if __name__ == '__main__':
    main()
