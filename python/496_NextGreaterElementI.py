class Solution:
    def nextGreaterElement(self, nums1: 'List[int]', nums2: 'List[int]') -> 'List[int]':
        ans = []
        for index, num in enumerate(nums1):
            print(index)
            ans.append(-1)
            findVal = False
            for i in range(len(nums2)):
                if nums2[i] == num:
                    findVal = True
                    continue
                if findVal == True and nums2[i] > num:
                    ans[index] = nums2[i]
                    break
        return ans


def main():
    print(Solution().nextGreaterElement([4, 1, 2], [1, 3, 4, 2]))
    # Output:  [-1,3,-1]
    print(Solution().nextGreaterElement([2, 4], [1, 2, 3, 4]))
    # Output:  [3,-1]
    print(Solution().nextGreaterElement([3, 1, 5, 7, 9, 2, 6],[1, 2, 3, 5, 6, 7, 9, 11]))
    # Output:  [5,2,6,9,11,3,7]



if __name__ == '__main__':
    main()
