class Solution:
    def sortArrayByParityII(self, A: 'List[int]') -> 'List[int]':
        A = sorted(A)
        evenList = []
        oddList = []
        for index in range(len(A)):
            if A[index] %2== 0:
                evenList.append(A[index])
            else:
                oddList.append(A[index])

        num = 0
        ans = []
        while num < len(evenList):
            ans.append(evenList[num])
            ans.append(oddList[num])
            num += 1
        return ans


if __name__ == '__main__':
    solution = Solution()
    print(solution.sortArrayByParityII([4,2,3,1]))
    print(solution.sortArrayByParityII([4, 2, 5, 7]))
    print(solution.sortArrayByParityII([3,4]))

    
