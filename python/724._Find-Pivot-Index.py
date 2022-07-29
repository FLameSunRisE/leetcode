from typing import List


class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        if(len(nums) == 1):
            return 0
        totSum = sum(nums)
        tempSum = 0
        for i in range(len(nums)):
            if(nums[i] == totSum - 2 * tempSum):
                return i
            tempSum += nums[i]
        return -1


def main():
    # Example:1
    nums = [1, 7, 3, 6, 5, 6]
    print(Solution().pivotIndex(nums))
    # Input: nums = [1,7,3,6,5,6]
    # Output: 3
    # Explanation:
    # The pivot index is 3.
    # Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
    # Right sum = nums[4] + nums[5] = 5 + 6 = 11
    print('------------------------------')

    # Example:2
    nums = [1, 2, 3]
    print(Solution().pivotIndex(nums))
    # Input: nums = [1,2,3]
    # Output: -1
    # Explanation:
    # There is no index that satisfies the conditions in the problem statement.
    print('------------------------------')

    # Example:3
    nums = [2, 1, -1]
    print(Solution().pivotIndex(nums))
    # Input: nums = [2, 1, -1]
    # Output: 0
    # Explanation:
    # The pivot index is 0.
    # Left sum = 0 (no elements to the left of index 0)
    # Right sum = nums[1] + nums[2] = 1 + -1 = 0


if __name__ == '__main__':
    main()
