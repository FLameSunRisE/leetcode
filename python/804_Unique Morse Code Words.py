class Solution(object):
    def uniqueMorseRepresentations(self, words):
        """
        :type words: List[str]
        :rtype: int
        """
        MORSE = [".-","-...","-.-.","-..",".","..-.","--.",
                 "....","..",".---","-.-",".-..","--","-.",
                 "---",".--.","--.-",".-.","...","-","..-",
                 "...-",".--","-..-","-.--","--.."]

        tranToMorseList = []
        for word in words:
            transToMorse = ''
            for char in word:
                transToMorse = transToMorse +(MORSE[ord(char) - ord('a')])
                pass
            tranToMorseList.append(transToMorse)
            pass
        ansSet = set(tranToMorseList)
        return len(ansSet)

if __name__ == '__main__':
    solution = Solution()
    print (solution.uniqueMorseRepresentations(["gin", "zen", "gig", "msg"]))