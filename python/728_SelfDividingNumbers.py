class Solution:
    def selfDividingNumbers(self, left, right):
        """
        :type left: int
        :type right: int
        :rtype: List[int]
        """
        def isDividing(n):
            for d in str(n):
                if d == '0' or n % int(d) > 0:
                    return False
            return True
            
        ans = []
        for n in range(left, right + 1):
            if isDividing(n):
                ans.append(n)
        return ans
    
    
#         ansList = []
#         number = None
#         remainder = None

#         while left <= right:
#             isSelfDividing = True
#             number = left
#             while number != 0 or isSelfDividing:
#                 remainder = number % 10
#                 isSelfDividing = remainder != 0  or left % remainder == 0
#                 number /= 10
#             if isSelfDividing:
#                 ansList.append(left)
#             left += 1
#         return ansList
        
        
        
if __name__ == '__main__':
    solution = Solution()
    print (solution.selfDividingNumbers(1,22))