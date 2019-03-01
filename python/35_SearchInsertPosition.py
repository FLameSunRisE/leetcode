from typing import List
import collections


class Solution:
    def searchInsert(self, nums, target):
        l, r = 0, len(nums)-1
        while l <= r:
            mid = (l+r)//2
            if nums[mid] < target:
                l = mid+1
            else:
                if nums[mid] == target and nums[mid-1] != target:
                    return mid
                else:
                    r = mid-1
        return l


def main():
    print(Solution().searchInsert([2, 3, 5, 6, 9], 7))
    # Output: 4
    print(Solution().searchInsert([1, 3, 5, 6], 5))
    # Output: 2
    print(Solution().searchInsert([1, 3, 5, 6], 2))
    # Output: 1
    print(Solution().searchInsert([1, 3, 5, 6], 7))
    # Output: 4
    print(Solution().searchInsert([1, 3, 5, 6], 0))
    # Output: 0


if __name__ == '__main__':
    main()
