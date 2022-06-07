class Solution:
    def romanToInt(self, s: str) -> int:
        tmp = {
            'I': 1,
            'V': 5,
            'X': 10,
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000,
        }
        sum = 0
        for i in range(0, len(s) - 1):
            if tmp[s[i]] < tmp[s[i+1]]:
                sum -= tmp[s[i]]
            else:
                sum += tmp[s[i]]
        return sum + tmp[s[-1]]


def main():
    print(Solution().romanToInt("III"))
    # Output: 3
    # Explanation: III = 3.
    print(Solution().romanToInt("LVIII"))
    # Output: 58
    # Explanation: L = 50, V = 5, III = 3.
    print(Solution().romanToInt("MCMXCIV"))
    # Output: 1994
    # Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.


if __name__ == '__main__':
    main()
