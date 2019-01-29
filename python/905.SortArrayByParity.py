class Solution:
    def sortArrayByParity(self, A):
        """
        :type A: List[int]
        :rtype: List[int]
        """
        oddList = []
        evenList = []
        for i in A:
            if i % 2 == 0:
                evenList.append(i)
            else:
                oddList.append(i)
        evenList.extend(oddList)
        print (evenList)
        return evenList

        
if __name__ == '__main__':
    solution = Solution()
    print (solution.sortArrayByParity([3,1,2,4]))