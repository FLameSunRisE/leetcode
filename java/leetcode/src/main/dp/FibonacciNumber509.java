package main.dp;

/**
 * FibonacciNumber509.
 *
 * @author jayyeh
 * @version 1.0.0
 * @date 2023/03/10
 */
public class FibonacciNumber509 {
    /**
     * fib-recursive.
     *
     * @param n n
     * @return int
     */
    public int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    /**
     * fib1-dp.
     *
     * @param n n
     * @return int
     */
    public int fib1(int n) {
        if (n == 0) {
            return 0;
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
