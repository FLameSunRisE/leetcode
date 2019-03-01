class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        l = 0
        r = (num+1 )// 2
        while l<=r:
            mid = (l+r)//2
            if mid * mid > num:
                r = mid -1
            elif mid * mid < num:
                l = mid +1
            else:
                return True
        return False

def main():
    print(Solution().isPerfectSquare(16))
    # Output: True
    print(Solution().isPerfectSquare(14))
    # Output: False


if __name__ == '__main__':
    main()
