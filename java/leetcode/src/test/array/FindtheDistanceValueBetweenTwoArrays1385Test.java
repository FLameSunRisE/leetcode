package test.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindtheDistanceValueBetweenTwoArrays1385Test {
    private leetcode.src.array.FindtheDistanceValueBetweenTwoArrays1385 findtheDistanceValueBetweenTwoArrays1385 =
            new leetcode.src.array.FindtheDistanceValueBetweenTwoArrays1385();

    @Test
    void findTheDistanceValueWhenArrayIsEmpty() {
        int[] list1 = {};
        int[] list2 = {};
        int d = 2;
        assertEquals(
                0, findtheDistanceValueBetweenTwoArrays1385.findTheDistanceValue(list1, list2, d));
    }

    @Test
    void findTheDistanceValueWhenArrayIsNull() {
        int[] list1 = null;
        int[] list2 = null;
        int d = 2;
        assertEquals(
                0, findtheDistanceValueBetweenTwoArrays1385.findTheDistanceValue(list1, list2, d));
    }
}