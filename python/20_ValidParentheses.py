class Solution:

    def isValid(self, s: str) -> bool:
        stack = []
        dict = {"]": "[", "}": "{", ")": "("}
        for char in s:
            if char in dict.values():
                stack.append(char)
            elif char in dict.keys():
                if stack == [] or dict[char] != stack.pop():
                    return False
            else:
                return False
        return stack == []


def main():
    print(Solution().isValid("()"))
    # Output: true
    print(Solution().isValid("()[]{}"))
    # Output: true
    print(Solution().isValid("(]"))
    # Output: false

    # Error case
    print(Solution().isValid("]"))
    # Output: false


if __name__ == '__main__':
    main()
