class Solution:
    def isPalindrome(self, x: int) -> bool:
        tmp = str(x)
        for i in range(len(tmp)):
            if(tmp[i] != tmp[len(tmp)-1-i]):
                return False
        return True

def main():
    print(Solution().isPalindrome(121))
    # Output: true
    print(Solution().isPalindrome(-121))
    # Output:false
    print(Solution().isPalindrome(10))
    # Output:false


if __name__ == '__main__':
    main()