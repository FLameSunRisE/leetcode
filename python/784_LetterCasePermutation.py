from typing import List


class Solution:
    def letterCasePermutation(self, S: str) -> List[str]:
        res = []
        for word in str:
            if word.isalpha(0):
                res.append(word)
                if word.islower():
            # if word.isalpha():
            #     res = [i+j for i in res for j in [word.upper(), word.lower()]]
            # else:
            #     res = [i+word for i in res]
        return res


def main():
    print(Solution().letterCasePermutation("a1b2"))
    # Output: ["a1b2", "a1B2", "A1b2", "A1B2"]
    print(Solution().letterCasePermutation("3z4"))
    # Output: ["3z4", "3Z4"]
    print(Solution().letterCasePermutation("12345"))
    # Output: ["12345"]


if __name__ == '__main__':
    main()
