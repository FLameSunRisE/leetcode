

class Solution:
    def findLUSlength(self, a: str, b: str) -> int:
        if a == b:
            return False
        return max(len(a), len(b))



def main():
    print(Solution().findLUSlength("aba","cdc"))
    # Output: 3
    # Explanation: The longest uncommon subsequence is "aba" (or "cdc"), 
    # because "aba" is a subsequence of "aba", 
    # but not a subsequence of any other strings in the group of two strings. 
    
if __name__ == '__main__':
    main()

        