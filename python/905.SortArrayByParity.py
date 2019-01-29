class Solution:
    def sortArrayByParity(self, A):
        """
        :type A: List[int]
        :rtype: List[int]
        """
        # oddList = []
        # evenList = []
        # for i in A:
        #     if i % 2 == 0:
        #         evenList.append(i)
        #     else:
        #         oddList.append(i)
        # evenList.extend(oddList)
        # return evenList
        i, j = 0, len(A) - 1
        while i < j:
            if A[i] % 2 > A[j] % 2:
                A[i], A[j] = A[j], A[i]

            if A[i] % 2 == 0: i += 1
            if A[j] % 2 == 1: j -= 1

        return A

        
if __name__ == '__main__':
    solution = Solution()
    print (solution.sortArrayByParity([3,1,2,4]))