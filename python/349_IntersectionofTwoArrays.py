class Solution:
    def intersection(self, nums1, nums2):
        ans = []
        for i in range(len(nums1)):
            if nums1[i] in nums2:
                ans.append(nums1[i])
                pass
            pass
        return list(set(ans))
    
    def intersection1(self, nums1, nums2):
        return list(set(nums1) & set(nums2))

def main():
    print(Solution().intersection([1, 2, 2, 1], [2, 2]))
    # Output:  [2]
    print(Solution().intersection([4, 9, 5], [9, 4, 9, 8, 4]))
    # Output: [9,4]


if __name__ == '__main__':
    main()
