class Solution:
    # dictionary
    def twoSum(self, numbers, target):
        dic = {}
        for i, num in enumerate(numbers):
            if target-num in dic:
                return [dic[target-num]+1, i+1]
            dic[num] = i

    # binary search
    def twoSum2(self, numbers, target):
        for i in range(len(numbers)):
            l, r = i+1, len(numbers)-1
            tmp = target - numbers[i]
            while l <= r:
                mid = l + (r-l)//2
                if numbers[mid] == tmp:
                    return [i+1, mid+1]
                elif numbers[mid] < tmp:
                    l = mid+1
                else:
                    r = mid-1


def main():
    print(Solution().twoSum2([2, 7, 11, 15], 9))
    # Output:  [1,2]
    # Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
    print(Solution().twoSum([0, 0, 3, 4], 0))


if __name__ == '__main__':
    main()
