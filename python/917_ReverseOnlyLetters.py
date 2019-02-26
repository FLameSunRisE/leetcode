class Solution:
    def reverseOnlyLetters(self, S: str) -> str:
        letters = []
        for c in S:
            if c.isalpha():
                letters.append(c)
        ans = []
        for c in S:
            if c.isalpha():
                ans.append(letters.pop())
            else:
                ans.append(c)
        return ''.join(ans)


def main():
    print(Solution().reverseOnlyLetters("ab-cd"))
    # Output: "dc-ba"
    print(Solution().reverseOnlyLetters("a-bC-dEf-ghIj"))
    # Output: "j-Ih-gfE-dCba"
    print(Solution().reverseOnlyLetters("Test1ng-Leet=code-Q!"))
    # Output: "Qedo1ct-eeLg=ntse-T!"


if __name__ == '__main__':
    main()
