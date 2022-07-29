from typing import List


class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        total = 0
        rslt = [None] * len(nums)
        for i in range(len(nums)):
            total += nums[i]
            rslt[i] = total
        return rslt


def main():
    # Example:1
    nums = [1, 2, 3, 4]
    print(Solution().runningSum(nums))
    # Input: nums = [1,2,3,4]
    # Output: [1,3,6,10]
    # Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
    print('------------------------------')
    # Example:2
    nums = [1, 1, 1, 1, 1]
    print(Solution().runningSum(nums))
    # Input: nums = [1,1,1,1,1]
    # Output: [1,2,3,4,5]
    # Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
    print('------------------------------')
    # Example:3
    nums = [3, 1, 2, 10, 1]
    print(Solution().runningSum(nums))
#    Input: nums = [3,1,2,10,1]
# Output: [3,4,6,16,17]


if __name__ == '__main__':
    main()
