package test.dp;

import main.dp.GetMaximuminGeneratedArray1646;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetMaximuminGeneratedArray1646Test {

    private GetMaximuminGeneratedArray1646 solution;

    @BeforeEach
    void setUp() {
        this.solution = new GetMaximuminGeneratedArray1646();
    }

    @Test
    void testGetMaximumGenerated() {
        int[] nums = {0, 1, 1, 2, 1, 3, 2, 3, 1, 4, 3, 5, 2, 5, 4, 5, 3, 4};
        int expected = 3;
        int actual = solution.getMaximumGenerated(7);
        Assertions.assertEquals(expected, actual);
        expected = 0;
        actual = solution.getMaximumGenerated(0);
        Assertions.assertEquals(expected, actual);
        expected = 1;
        actual = solution.getMaximumGenerated(2);
        Assertions.assertEquals(expected, actual);
        expected = 2;
        actual = solution.getMaximumGenerated(3);
        Assertions.assertEquals(expected, actual);
        expected = 2;
        actual = solution.getMaximumGenerated(4);
        Assertions.assertEquals(expected, actual);
        expected = 3;
        actual = solution.getMaximumGenerated(5);
        Assertions.assertEquals(expected, actual);
    }
}