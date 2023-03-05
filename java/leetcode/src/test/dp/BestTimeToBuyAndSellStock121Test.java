package leetcode.src.test.dp;

import leetcode.src.main.dp.BestTimeToBuyAndSellStock121;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BestTimeToBuyAndSellStock121Test {

    private BestTimeToBuyAndSellStock121 solution;

    @BeforeEach
    void setUp() {
        this.solution = new BestTimeToBuyAndSellStock121();
    }

    @Test
    void maxProfit1() {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int expected1 = 5;
        int result1 = solution.maxProfit(prices1);
        Assertions.assertEquals(expected1, result1);
    }

    @Test
    void maxProfit2() {
        int[] prices2 = {7, 6, 4, 3, 1};
        int expected2 = 0;
        int result2 = solution.maxProfit(prices2);
        Assertions.assertEquals(expected2, result2);
    }

    @Test
    void maxProfit3() {
        int[] prices3 = {3, 2, 6, 5, 0, 3};
        int expected3 = 4;
        int result3 = solution.maxProfit(prices3);
        Assertions.assertEquals(expected3, result3);
    }
}
