
from typing import List


class Solution:
    # 解法一
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if(strs is None or len(strs) == 0):
            return ""
        pre = strs[0]
        target = 1
        while (target < len(strs)):
            while strs[target].find(pre) != 0:
                tmp = len(pre) - 1
                pre = pre[:tmp]
            target += 1
        return pre
    # 解法二

    def longestCommonPrefix2(self, strs: List[str]) -> str:
        if(strs is None or len(strs) == 0):
            return ""
        prefix = strs[0]
        for i in range(1, len(strs)):
            while(strs[i].find(prefix) != 0):
                prefix = prefix[:-1]
                if len(prefix) == 0:
                    return ""
        return prefix

    # 大神寫法
    def longestCommonPrefix3(self, m):
        if not m:
            return ''
            # since list of string will be sorted and retrieved min max by alphebetic order
        s1 = min(m)
        s2 = max(m)
        print('s1:' + str(s1))
        print('s2:' + str(s2))

        for i, c in enumerate(s1):
            print('i:' + str(i), 'c:' + str(c))
            if c != s2[i]:
                print('if ans:' + str(s1))
                return s1[:i]  # stop until hit the split index
        print('ans:' + str(s1))
        return s1


def main():
    print(Solution().longestCommonPrefix(["flower", "flow", "flight"]))
    # Output: "fl"
    print(Solution().longestCommonPrefix(["dog", "dacecar", "car"]))
    # Output: ""
    # Explanation: There is no common prefix among the input strings.
    print(Solution().longestCommonPrefix(["c", "acc", "ccc"]))
    # Output:"c"


if __name__ == '__main__':
    main()
