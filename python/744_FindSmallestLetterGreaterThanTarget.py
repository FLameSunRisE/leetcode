from typing import List
import collections


class Solution:
    def nextGreatestLetter(self, letters: List[str], target: str) -> str:
        for c in letters:
            if c > target:
                return c
        return letters[0]


def main():
    print(Solution().nextGreatestLetter(["c", "f", "j"], 'a'))
    # Output: "c"
    print(Solution().nextGreatestLetter(["c", "f", "j"], 'c'))
    # Output: "f"
    print(Solution().nextGreatestLetter(["c", "f", "j"], 'd'))
    # Output: "f"
    print(Solution().nextGreatestLetter(["c", "f", "j"], 'g'))
    # Output: "j"
    print(Solution().nextGreatestLetter(["c", "f", "j"], 'j'))
    # Output: "c"
    print(Solution().nextGreatestLetter(["c", "f", "j"], 'k'))
    # Output: "c"


if __name__ == '__main__':
    main()
