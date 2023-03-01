package leetcode.src.test.array;

import leetcode.src.main.array.EasyFindPivotIndex724;
import main.array.TeemoAttacking495;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * TeemoAttacking495Test.
 *
 * @author jayyeh
 * @version 1.0.0
 * @date 2023/03/01
 */
public class TeemoAttacking495Test {


    private TeemoAttacking495 solution;

    @BeforeEach
    public void beforeEach() {
        solution = new TeemoAttacking495();
    }

    @Test
    void findPoisonedDuration() {
        int[] list = {1, 4};
        int duration = 2;
        Assertions.assertEquals(4, solution.findPoisonedDuration(list, duration));
    }

    @Test
    void findPoisonedDuration1() {
        int[] list = {1,2};
        int duration = 2;
        Assertions.assertEquals(3, solution.findPoisonedDuration(list, duration));
    }
}