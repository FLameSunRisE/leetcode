# from collections import Counter
import collections
class Solution:
    def repeatedNTimes(self, A):
        """
        :type A: List[int]
        :rtype: int
        """
        items = set(A)
        for item in items:
            if A.count(item)> 1:
                return item
            pass

if __name__ == '__main__':
    solution = Solution()
    print (solution.repeatedNTimes([1,2,3,3]))
    print (solution.repeatedNTimes([2,1,2,5,3,2]))
    print (solution.repeatedNTimes([5,1,5,2,5,3,5,4]))
