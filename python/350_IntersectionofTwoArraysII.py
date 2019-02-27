from typing import List
import collections

class Solution:
    def intersect(self, nums1, nums2):
        counts = {}
        res = []
        for num in nums1:
            counts[num] = counts.get(num, 0) + 1
        for num in nums2:
            if num in counts and counts[num] > 0:
                res.append(num)
                counts[num] -= 1
        return res

    # logic same up
    def intersect1(self, nums1, nums2):
        counts = collections.Counter(nums1)
        res = []
        for num in nums2:
            if counts[num] > 0:
                res += num,
                counts[num] -= 1
        return res

    # Two point 
    def intersect2(self, nums1, nums2):
        nums1, nums2 = sorted(nums1), sorted(nums2)
        pt1 = pt2 = 0
        res = []
        while True:
            try:
                if nums1[pt1] > nums2[pt2]:
                    pt2 += 1
                elif nums1[pt1] < nums2[pt2]:
                    pt1 += 1
                else:
                    res.append(nums1[pt1])
                    pt1 += 1
                    pt2 += 1
            except IndexError:
                break
        return res


def main():
    print(Solution().intersect1([1, 2, 2, 1], [2, 2]))
    # Output:  [2,2]
    print(Solution().intersect1([4, 9, 5],  [9, 4, 9, 8, 4]))
    # Output: [4,9]


if __name__ == '__main__':
    main()
