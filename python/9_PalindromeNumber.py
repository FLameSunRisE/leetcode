class Solution:
    def isPalindrome2(self, x: int) -> bool:
        tmp = str(x)
        for i in range(len(tmp)):
            if(tmp[i] != tmp[len(tmp)-1-i]):
                return False
        return True

    def isPalindrome(self, x: int) -> bool:
        # if x is negative, return False.
        # if x is positive and last digit is 0,that also cannot form a palindrome, return False.
        if x < 0 or (x > 0 and x % 10 == 0):
            return False

        result = 0
        while x > result:
            result = result * 10 + x % 10
            x = x // 10
            print("result :" + str(result) + ", x:" + str(x))

        return True if (x == result or x == result // 10) else False


def main():
    print(Solution().isPalindrome(121))
    # Output: true
    print(Solution().isPalindrome(-121))
    # Output:false
    print(Solution().isPalindrome(10))
    # Output:false


if __name__ == '__main__':
    main()
