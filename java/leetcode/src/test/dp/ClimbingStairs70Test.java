package test.dp;

import main.dp.ClimbingStairs70;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairs70Test {
    private ClimbingStairs70 solution;

    @BeforeEach
    void setUp() {
        this.solution= new ClimbingStairs70();
    }

    @Test
    public void testClimbStairs() {
        int n1 = 2;
        int expected1 = 2;
        int result1 = solution.climbStairs(n1);
        Assertions.assertEquals(expected1, result1);

        int n2 = 3;
        int expected2 = 3;
        int result2 = solution.climbStairs(n2);
        Assertions.assertEquals(expected2, result2);

        int n3 = 4;
        int expected3 = 5;
        int result3 = solution.climbStairs(n3);
        Assertions.assertEquals(expected3, result3);
    }
}