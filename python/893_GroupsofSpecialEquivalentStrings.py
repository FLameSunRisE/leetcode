class Solution:
    def numSpecialEquivGroups(self, A: 'List[str]') -> 'int':
        s = set()
        for char in A:
            odd = ""
            even = ""
            for i, c in enumerate(char):
                if i % 2 == 0:
                    odd += c
                else:
                    even += c
            s.add(''.join(sorted(odd) + sorted(even)))
        return len(s)


def main():
    input1 = ["a", "b", "c", "a", "c", "c"]
    # Output: 3 groups ["a","a"], ["b"], ["c","c","c"]
    print(Solution().numSpecialEquivGroups(input1))
    input2 = ["aa", "bb", "ab", "ba"]
    # Output: 4 groups ["aa"], ["bb"], ["ab"], ["ba"]
    print(Solution().numSpecialEquivGroups(input2))
    input2 = ["abc","acb","bac","bca","cab","cba"]
    # Output: 3 groups ["abc","cba"], ["acb","bca"], ["bac","cab"]
    print(Solution().numSpecialEquivGroups(input2))
    input2 = ["abcd", "cdab","adcb","cbad"]
    # Output: 1 group ["abcd","cdab","adcb","cbad"]
    print(Solution().numSpecialEquivGroups(input2))


if __name__ == '__main__':
    main()
