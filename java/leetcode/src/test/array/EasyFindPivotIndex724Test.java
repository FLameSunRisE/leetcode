package leetcode.src.test.array;

import leetcode.src.main.array.EasyFindPivotIndex724;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * EasyFindPivotIndex724Test.
 *
 * @author jayyeh
 * @version 1.0.0
 * @date 2023/03/01
 */
public class EasyFindPivotIndex724Test {

    private EasyFindPivotIndex724 solution;

    @BeforeEach
    public void beforeEach() {
        solution = new EasyFindPivotIndex724();
    }

    @Test
    void test_find_pivot_index_1() {
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(solution);
        int result = solution.pivotIndex(nums);
        assertEquals(3, result);
    }

    @Test
    void test_find_pivot_index_2() {
        int[] nums = {1, 2, 3};
        int result = solution.pivotIndex(nums);
        assertEquals(-1, result);
    }

    @Test
    void test_find_pivot_index_3() {
        int[] nums = { 2, 1, -1 };
        int result = solution.pivotIndex(nums);
        assertEquals(0, result);
    }
}