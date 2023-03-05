package leetcode.src.main.dp;

/**
 * BestTimeToBuyAndSellStock121.
 *
 * @author jayyeh
 * @version 1.0.0
 * @date 2023/03/05
 */
public class BestTimeToBuyAndSellStock121 {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
}
