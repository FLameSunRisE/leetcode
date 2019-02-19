class Solution:
    def findWords(self, words: 'List[str]') -> 'List[str]':
        a = set('qwertyuiop')
        b = set('asdfghjkl')
        c = set('zxcvbnm')
        ans = []
        for word in words:
            loWordList = set(word.lower())
            if set(a) - (set(a) - set(loWordList)) == loWordList:
                ans.append(word)
            if set(b) - (set(b) - set(loWordList)) == loWordList:
                ans.append(word)
            if set(c) - (set(c) - set(loWordList)) == loWordList:
                ans.append(word)
        return ans


def main():
    input = ["Hello", "Alaska", "Dad", "Peace"]
    # Output: ["Alaska", "Dad"]
    print(Solution().findWords(input))


if __name__ == '__main__':
    main()
