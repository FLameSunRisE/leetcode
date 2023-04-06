package main.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SetMismatch645Test {

    private SetMismatch645 solution;

    @BeforeEach
    void setUp() {
        solution = new SetMismatch645();
    }

    @Test
    void findErrorNums() {
        int[] nums = {1, 2, 2, 4};
        int[] expected = {2, 3};
        int[] actual = solution.findErrorNums(nums);
        assertArrayEquals(expected, actual);
    }

    @Test
    void findErrorNums2() {
        int[] nums = {1, 1};
        int[] expected = {1, 2};
        int[] actual = solution.findErrorNums(nums);
        assertArrayEquals(expected, actual);
    }

    @Test
    void findErrorNums3() {
        int[] nums = {2, 2};
        int[] expected = {2, 1};
        int[] actual = solution.findErrorNums(nums);
        assertArrayEquals(expected, actual);
    }

    @Test
    void findErrorNums4() {
        int[] nums = {3, 2, 3, 4, 6, 5};
        int[] expected = {3, 1};
        int[] actual = solution.findErrorNums(nums);
        assertArrayEquals(expected, actual);
    }

    @Test
    void findErrorNums5() {
        int[] nums = {1, 5, 3, 2, 2, 7, 6, 4, 8, 9};
        int[] expected = {2, 10};
        int[] actual = solution.findErrorNums(nums);
        assertArrayEquals(expected, actual);
    }
}