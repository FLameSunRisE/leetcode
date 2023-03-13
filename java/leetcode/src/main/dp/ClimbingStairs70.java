package main.dp;

/**
 * ClimbingStairs70.
 *
 * @author jayyeh
 * @version 1.0.0
 * @date 2023/03/13
 */
public class ClimbingStairs70 {

    /**
     * climbStairs.
     *
     * @param n n
     * @return int
     */
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        //TODO(jay), 不是很了解
        int[][] base = {{1, 1}, {1, 0}};
        int[][] res = pow(base, n - 2);
        return 2 * res[0][0] + res[1][0];
    }

    /**
     * pow-pow 方法使用矩陣快速冪計算矩陣 base 的 exp 次方.
     *
     * @param base 基地
     * @param exp  经验值
     * @return {@link int[][] }
     */
    private int[][] pow(int[][] base, int exp) {
        int[][] res = {{1, 0}, {0, 1}};
        while (exp > 0) {
            if ((exp & 1) == 1) {
                res = multiply(res, base);
            }
            base = multiply(base, base);
            exp >>= 1;
        }
        return res;
    }

    /**
     * multiply-常規的矩陣相乘方法.
     *
     * @param a 一个
     * @param b b
     * @return {@link int[][] }
     */
    private int[][] multiply(int[][] a, int[][] b) {
        int[][] c = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j];
            }
        }
        return c;
    }
    public int climbStairs_dp(int n) {
        if (n <= 2) {
            return n;
        }

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
