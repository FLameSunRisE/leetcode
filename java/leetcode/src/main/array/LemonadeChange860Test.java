package main.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LemonadeChange860Test {

    private LemonadeChange860 solution;

    @BeforeEach
    void setUp() {
        solution = new LemonadeChange860();
    }


    @Test
    public void testLemonadeChange1() {
        int[] bills = {5, 5, 5, 10, 20};
        Assertions.assertTrue(solution.lemonadeChange(bills));
    }

    @Test
    public void testLemonadeChange2() {
        int[] bills = {5, 5, 10};
        Assertions.assertTrue(solution.lemonadeChange(bills));
    }

    @Test
    public void testLemonadeChange3() {
        int[] bills = {10, 10};
        Assertions.assertFalse(solution.lemonadeChange(bills));
    }

    @Test
    public void testLemonadeChange4() {
        int[] bills = {5, 5, 10, 10, 20};
        Assertions.assertFalse(solution.lemonadeChange(bills));
    }

    @Test
    public void testLemonadeChange5() {
        int[] bills = {5, 5, 5, 5, 10, 5, 10, 10, 10, 20};
        Assertions.assertTrue(solution.lemonadeChange(bills));
    }

    @Test
    public void testLemonadeChange6() {
        int[] bills = {5, 5, 5, 20};
        Assertions.assertTrue(solution.lemonadeChange(bills));
    }
}