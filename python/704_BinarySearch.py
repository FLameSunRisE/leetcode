from typing import List
import collections


class Solution:
    def search(self, nums: List[int], target: int) -> int:
        if target in nums:
            return nums.index(target)
        return -1

    # binary search
    def search1(self, nums, target):
        left, right = 0, len(nums)-1
        while left <= right:
            mid = (left+right) // 2
            #print(left,right,mid)
            if nums[mid] < target:
                left = mid+1
            elif nums[mid] > target:
                right = mid-1
            else:
                return mid
        return -1

    # recursive 
    def search2(self, nums, target):
        def recur_search(nums, target, left, right):
            if left <= right:
                mid = (left+right)//2
                if nums[mid] == target:
                    return mid
                elif nums[mid] < target:
                    return recur_search(nums, target, mid+1, right)
                else:
                    return recur_search(nums, target, left, mid-1)
            else:
                return -1

        left, right = 0, len(nums)-1
        return recur_search(nums, target, left, right)


def main():
    print(Solution().search1([-1, 0, 3, 5, 9, 12], 9))
    # Output: 4
    # Explanation: 9 exists in nums and its index is 4

    print(Solution().search1([-1, 0, 3, 5, 9, 12], 2))
    # Output: -1
    # Explanation: 2 does not exist in nums so return -1


if __name__ == '__main__':
    main()
