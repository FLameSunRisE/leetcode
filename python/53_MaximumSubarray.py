from typing import List


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if len(nums) <= 0:
            return 0
        if len(nums) == 1:
            return nums[0]
        dp = [0]*len(nums)
        for i, num in enumerate(nums):
            dp[i] = max(dp[i-1] + num, num)
        return max(dp)


def main():
    # Example:1
    nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
    print(Solution().maxSubArray(nums))
    # Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    # Output: 6
    # Explanation: [4,-1,2,1] has the largest sum = 6.
    print('------------------------------')
    # Example:2
    nums = [1]
    print(Solution().maxSubArray(nums))
    # Input: nums = [1]
    # Output: 1
    print('------------------------------')
    # Error case
    nums = [5, 4, -1, 7, 8]
    print(Solution().maxSubArray(nums))
    Input: nums = [5, 4, -1, 7, 8]
    Output: 23


if __name__ == '__main__':
    main()
