class Solution:
    def smallestRangeI(self, A: 'List[int]', K: 'int') -> 'int':
        ans = max(A)- min(A) - 2*K
        if ans<0:
            return 0
        else:
            return ans


if __name__ == '__main__':
    solution = Solution()
    print(solution.smallestRangeI([1], 0))  # 0
    print(solution.smallestRangeI([0, 10], 2))  # 6
    print(solution.smallestRangeI([1, 3, 6], 3))  # 0
