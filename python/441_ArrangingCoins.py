class Solution:
    def arrangeCoins(self, n: int) -> int:
        key = 1
        while n >= 0:
            n = n - key
            key += 1
        return key-2


def main():
    print(Solution().arrangeCoins(5))
    # Output:Because the 3rd row is incomplete, we return 2.
    print(Solution().arrangeCoins(8))
    # Output: Because the 4th row is incomplete, we return 3.


if __name__ == '__main__':
    main()
