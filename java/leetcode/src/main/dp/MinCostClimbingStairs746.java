package main.dp;

import java.util.Arrays;

/**
 * MinCostClimbingStairs746.
 *
 * @author jay
 * @version 1.0.0
 * @date 2023/03/14
 */
public class MinCostClimbingStairs746 {

  public int minCostClimbingStairs(int[] cost) {
    int n = cost.length;
    int[] dp = new int[n];
    dp[0] = cost[0];
    dp[1] = cost[1];
    for (int i = 2; i < n; i++) {
      dp[i] = Math.min(dp[i-1], dp[i-2]) + cost[i];
    }
    return Math.min(dp[n-1], dp[n-2]);
  }

}
