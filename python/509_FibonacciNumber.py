class Solution:
    def fib(self, N: 'int') -> 'int':
        if N==0:
            return 0
        elif N==1:
            return 1

        ans = self.fib(N-1) + self.fib(N-2)
        return ans
        

if __name__ == '__main__':
    solution = Solution()
    print(solution.fib(2))
    print(solution.fib(3))
    print(solution.fib(4))
