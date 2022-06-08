
from typing import List


class Solution:
    # def longestCommonPrefix(self, strs: List[str]) -> str:
    #     isLast = True
    #     strLength = len(strs)
    #     index = 0
    #     while isLast:
    #         print(str(strLength))
    #         for

    #     return ''
     def longestCommonPrefix(self, m):
        if not m: return ''
		    # since list of string will be sorted and retrieved min max by alphebetic order
        s1 = min(m)
        s2 = max(m)

        for i, c in enumerate(s1):
            print('i:' + str(i))
            print('i:' + str(c))
            if c != s2[i]:
                return s1[:i] #stop until hit the split index
        return s1


def main():
    print(Solution().longestCommonPrefix(["flower", "flow", "flight"]))
    # Output: "fl"
    print(Solution().longestCommonPrefix(["dog", "racecar", "car"]))
    # Output: ""
    # Explanation: There is no common prefix among the input strings.


if __name__ == '__main__':
    main()
