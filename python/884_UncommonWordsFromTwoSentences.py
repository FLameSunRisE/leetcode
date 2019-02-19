class Solution:
    def uncommonFromSentences(self, A: 'str', B: 'str') -> 'List[str]':
        s = A + ' '+B
        s = s.split()
        ans = []
        for word in set(s):
            if s.count(word)==1:
                ans.append(word)
        return ans


def main():
    A = "this apple is sweet"
    B = "this apple is sour"
    # Output: ["sweet","sour"]
    print(Solution().uncommonFromSentences(A,B))

if __name__ == '__main__':
    main()
