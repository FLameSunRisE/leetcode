class Solution:
    def peakIndexInMountainArray(self, A):
        """
        :type A: List[int]
        :rtype: int
        """
        # linear scan
        # for num in range(0,len(A)):
        #     if A[num] > A[num+1]:
        #         return num

        # Binary
        max = len(A)-1
        min = 0
        while min < max:
            mid = (min + max) // 2
            if A[mid] < A[mid+1]:
                min = mid + 1
            else:
                max = mid
        return min


if __name__ == '__main__':
    solution = Solution()

    print(solution.peakIndexInMountainArray([0, 1, 0]))
    print(solution.peakIndexInMountainArray([0, 2, 1, 0]))
