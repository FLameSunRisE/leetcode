class Solution:
    def is_prime_number(self, x):
        if x >= 2:
            for y in range(2,x):
                if not ( x % y ):
                    return False
        else:
            return False
        return True
    def countPrimeSetBits(self, L: int, R: int) -> int:
        count = 0
        primes = {2, 3, 5, 7, 11, 13, 17, 19}
        for i in range(L, R+1):
            num = bin(i).split("b")[1].count('1')
            if num in primes:
                count += 1
        return count

def main():
    print(Solution().countPrimeSetBits(6, 10))
    # Output: 4
    # Explanation:
    # 6 -> 110 (2 set bits, 2 is prime)
    # 7 -> 111 (3 set bits, 3 is prime)
    # 9 -> 1001 (2 set bits , 2 is prime)
    # 10->1010 (2 set bits , 2 is prime)

    print(Solution().countPrimeSetBits(10, 15))
    # Output: 5
    # Explanation:
    # 10 -> 1010 (2 set bits, 2 is prime)
    # 11 -> 1011 (3 set bits, 3 is prime)
    # 12 -> 1100 (2 set bits, 2 is prime)
    # 13 -> 1101 (3 set bits, 3 is prime)
    # 14 -> 1110 (3 set bits, 3 is prime
    # 15 -> 1111 (4 set bits, 4 is not prime)
if __name__ == '__main__':
    main()
