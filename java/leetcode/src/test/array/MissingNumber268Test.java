package test.array;

import main.array.MissingNumber268;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingNumber268Test {

    private MissingNumber268 solution;

    @BeforeEach
    void setUp() {
        this.solution = new MissingNumber268();
    }

    @Test
    public void testMissingNumber() {
        int[] nums1 = {3, 0, 1};
        int expected1 = 2;
        int result1 = solution.missingNumber(nums1);
        assertEquals(expected1, result1);

        int[] nums2 = {0, 1};
        int expected2 = 2;
        int result2 = solution.missingNumber(nums2);
        assertEquals(expected2, result2);

        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int expected3 = 8;
        int result3 = solution.missingNumber(nums3);
        assertEquals(expected3, result3);
    }
}