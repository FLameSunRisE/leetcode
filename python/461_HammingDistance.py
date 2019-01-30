class Solution:
    def hammingDistance(self, x, y):
        """
        :type x: int
        :type y: int
        :rtype: int
        """
        ans = bin(x^y).count('1')
        return ans

if __name__ == '__main__':
    solution = Solution()
    print (solution.hammingDistance(1,4))