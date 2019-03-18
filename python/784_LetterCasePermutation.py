from typing import List


class Solution:
    def letterCasePermutation(self, S) -> List[str]:
        ans = []
        def dfs(S, i, n):
            if i == n:
                ans.append(''.join(S))
                return
            dfs(S, i + 1, n)
            if not S[i].isalpha():
                return
            S[i] = chr(ord(S[i]) ^ (1 << 5))
            dfs(S, i + 1, n)
            S[i] = chr(ord(S[i]) ^ (1 << 5))
        dfs(list(S), 0, len(S))
        return ans


def main():
    print(Solution().letterCasePermutation("a1b2"))
    # Output: ["a1b2", "a1B2", "A1b2", "A1B2"]
    print(Solution().letterCasePermutation("3z4"))
    # Output: ["3z4", "3Z4"]
    print(Solution().letterCasePermutation("12345"))
    # Output: ["12345"]


if __name__ == '__main__':
    main()
