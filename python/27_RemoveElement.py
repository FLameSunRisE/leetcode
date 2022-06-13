from typing import List


class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        if len(nums) == 0:
            return 0
        i = 0
        for num in nums:
            if num != val:
                nums[i] = num
                i += 1
        return i


def main():
    # Example:1
    nums = [3, 2, 2, 3]
    val = 3
    print(Solution().removeElement(nums, val))
    # Input: nums = [3,2,2,3], val = 3
    # Output: 2, nums = [2,2,_,_]

    # Example:2
    nums = [0, 1, 2, 2, 3, 0, 4, 2]
    val = 2
    print(Solution().removeElement(nums, val))
    # Input:nums = [0,1,2,2,3,0,4,2], val = 2
    # Output: 5, nums = [0, 1, 4, 0, 3, _, _, _]

    # Example:3
    # list1 = [], list2 = []
    # print(Solution().mergeTwoLists(list1, list2))
    # Input: list1 = [], list2 = [0]
    # Output: [0]

# Error case
# print(Solution().isValid("]"))
# # Output: false


if __name__ == '__main__':
    main()
