import json

def stringToIntegerList(input):
    return json.loads(input)

class Solution:
    def largestPerimeter(self, A) -> int:
        A.sort(reverse=True)
        for index in range(len(A) - 2):
            if A[index+1] + A[index+2] > A[index]:
                return A[index] + A[index+1] + A[index+2]
        return 0

def main():
    A = stringToIntegerList('[2,1,2]')
    ret = Solution().largestPerimeter(A)
    out = str(ret)
    print(out)
    # Output: 5

    A = stringToIntegerList('[1,2,1]')
    ret = Solution().largestPerimeter(A)
    out = str(ret)
    print(out)
    # Output: 0

    A = stringToIntegerList('[3,2,3,4]')
    ret = Solution().largestPerimeter(A)
    out = str(ret)
    print(out)
    # Output: 10

    A = stringToIntegerList('[3,6,2,3]')
    ret = Solution().largestPerimeter(A)
    out = str(ret)
    print(out)
    # Output: 8


if __name__ == '__main__':
    main()
