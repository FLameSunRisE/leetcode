class Solution:
    def countBalls(self, lowLimit: int, highLimit: int) -> int:
        box = [0] * 46
        mx = 0
        for i in range(lowLimit, highLimit + 1):
            sm = 0
            while i > 0:
                sm += i % 10
                i //= 10
            box[sm] += 1
            mx = max(mx, box[sm])
        return mx
        


def main():
    print(Solution().countBalls(1,10))
    # Output: 
    print(Solution().countBalls(5,15)
    # Output: 


if __name__ == '__main__':
    main()