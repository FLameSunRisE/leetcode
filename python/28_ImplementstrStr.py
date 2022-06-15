from typing import List


class Solution:
    def strStr1(self, haystack: str, needle: str) -> int:
        return haystack.find(needle)

    def strStr(self, haystack: str, needle: str) -> int:
        if len(needle) == 0:
            return 0
        for i in range(len(haystack)):
            if haystack[i:i+len(needle)] == needle:
                return i
        return -1


def main():
    # Example:1
    haystack = "hello"
    needle = "ll"
    print(Solution().strStr(haystack, needle))
    # Input: haystack = "hello", needle = "ll"
    # Output: 2

    # Example:2
    haystack = "aaaaa"
    needle = "bba"
    print(Solution().strStr(haystack, needle))
    # Input:haystack = "aaaaa", needle = "bba"
    # Output: -1

    # Error case
    haystack = "a"
    needle = "a"
    print(Solution().strStr(haystack, needle))
    # Output: -1


if __name__ == '__main__':
    main()
