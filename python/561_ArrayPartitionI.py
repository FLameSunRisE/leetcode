import json

def stringToIntegerList(input):
    return json.loads(input)

class Solution:
    def arrayPairSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        sortedList = sorted(nums)
        AnsList = []
        for num in range(0,len(sortedList)):
            if num %2 == 0:
                AnsList.append(min(sortedList[num],sortedList[num+1]))
        return sum(AnsList)


if __name__ == '__main__':
    solution = Solution()
    nums = stringToIntegerList('[1,4,3,2]')
    ret = Solution().arrayPairSum(nums)
    out = str(ret)
    print(out)