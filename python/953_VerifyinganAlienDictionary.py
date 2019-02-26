class Solution:
    def isAlienSorted(self, words, order) -> bool:
        dic = {}
        for i, c in enumerate(order):
            dic[c] = i
        for i in range(len(words)-1):
            current = words[i]
            next = words[i+1]
            for i in range(min(len(current), len(next))):
                if current[i] != next[i]:
                    if dic[current[i]] > dic[next[i]]:
                        return False
                    break
                else:
                    if len(current) > len(next):
                        return False
        return True

def main():
    print(Solution().isAlienSorted(["hello","leetcode"],"hlabcdefgijkmnopqrstuvwxyz"))
    # Output: true
    # Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.

    print(Solution().isAlienSorted(["word","world","row"],"worldabcefghijkmnpqstuvxyz"))
    # Output: false
    # Explanation: As 'd' comes after 'l' in this language, then words[0] > words[1], hence the sequence is unsorted.

    print(Solution().isAlienSorted(["apple","app"],"abcdefghijklmnopqrstuvwxyz"))
    # Output: false
    # Explanation: The first three characters "app" match, and the second string is shorter (in size.) According to lexicographical rules "apple" > "app", because 'l' > '∅', where '∅' is defined as the blank character which is less than any other character (More info).
if __name__ == '__main__':
    main()
