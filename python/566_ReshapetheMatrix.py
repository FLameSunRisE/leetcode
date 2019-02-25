class Solution:
    def matrixReshape(self, nums, r, c):
        """
        :type nums: List[List[int]]
        :type r: int
        :type c: int
        :rtype: List[List[int]]
        """
        row = len(nums)
        col = len(nums[0])
        ans = []
        if (row * col) % (c*r) == 0:
            oneRow = []
            for num in nums:
                oneRow += num
            print(oneRow)
            for ind in range(0, r*c, c):
                ans.append(oneRow[ind:ind+c])
        else:
            return nums
        return ans

def main():
    nums = [[1,2],[3,4]]
    print(Solution().matrixReshape(nums, 1, 4))
    # Output: [[1,2,3,4]]
    # Explanation:
    # The row-traversing of nums is [1,2,3,4]. The new reshaped matrix is a 1 * 4 matrix, 
    # fill it row by row by using the previous list.

    # print(Solution().matrixReshape([[1,2],[3,4]], 2, 4))
    # Output: [[1,2], [3,4]]
    # Explanation:
    # There is no way to reshape a 2 * 2 matrix to a 2 * 4 matrix. So output the original matrix.

if __name__ == '__main__':
    main()
