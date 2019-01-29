class Solution:
    def flipAndInvertImage(self, A):
        """
        :type A: List[List[int]]
        :rtype: List[List[int]]
        """
        for row in range(len(A)):
            A[row] = A[row][::-1]
            for col in range(len(A[row])):
                A[row][col] ^= 1
        return A
        
        
if __name__ == '__main__':
    solution = Solution()
    print (solution.flipAndInvertImage([[1,1,0],[1,0,1],[0,0,0]]))
    print (solution.flipAndInvertImage([[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]))