from typing import List


class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        word_list = s.split()
        return len(word_list[-1])


def main():
    # Example:1
    s = "Hello World"
    print(Solution().lengthOfLastWord(s))
    # Input: s = "Hello World"
    # Output: 5
    # Explanation: The last word is "World" with length 5.
    print('------------------------------')
    # Example:2
    s = "   fly me   to   the moon  "
    print(Solution().lengthOfLastWord(s))
    # Input: s = "   fly me   to   the moon  "
    # Output: 4
    # Explanation: The last word is "moon" with length 4.
    print('------------------------------')
    # Error case
    s = "luffy is still joyboy"
    print(Solution().lengthOfLastWord(s))
    # Input: s = "luffy is still joyboy"
    # Output: 6
    # Explanation: The last word is "joyboy" with length 6.


if __name__ == '__main__':
    main()
