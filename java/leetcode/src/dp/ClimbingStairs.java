package leetcode.src.dp

/**
 * Created by jayyeh on 2022/07/29
 * <p>
 */
public class ClimbingStairs {
    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println();
        System.out.println(new ClimbingStairs().climbStairs(2));
        System.out.println(new ClimbingStairs().climbStairs(3));
    }

    public int climbStairs(int n) {
        // basic check
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
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
