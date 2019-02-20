class Solution:
    def singleNumber(self, nums: 'List[int]') -> 'int':
        for i in set(nums):
            if nums.count(i) == 1:
                return i
def main():
    print(Solution().singleNumber([2,2,1]))
    # Output: 1
    print(Solution().singleNumber([4,1,2,1,2]))
    # Output: 4

if __name__ == '__main__':
    main()