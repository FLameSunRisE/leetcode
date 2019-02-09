class Solution:
    def reverseString(self, s: 'List[str]') -> 'None':
        """
        Do not return anything, modify s in-place instead.
        """
        min = 0
        max = len(s)-1
        print(''.join(reversed(s)))
        while min != max and min < max:
            s[min], s[max] = s[max], s[min]
            min += 1
            max -= 1
        return 


if __name__ == '__main__':
    solution = Solution()
    print(solution.reverseString(["h", "e", "l", "l", "o"]))
    # Output:  ["o","l","l","e","h"]
    print(solution.reverseString(["H","a","n","n","a","h"]))
    # Output:  ["h","a","n","n","a","H"]
