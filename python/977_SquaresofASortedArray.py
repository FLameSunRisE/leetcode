class Solution:
    def sortedSquares(self, A):
        """
        :type A: List[int]
        :rtype: List[int]
        """
        squareList = self.square(A)
        squareList.sort(key=int,reverse = False)
        print (squareList)
        return squareList

    def square(self,list):
        return [i ** 2 for i in list]

        
if __name__ == '__main__':
    solution = Solution()
    print (solution.sortedSquares([-4,-1,0,3,10]))
    print (solution.sortedSquares([-7,-3,2,3,11]))
