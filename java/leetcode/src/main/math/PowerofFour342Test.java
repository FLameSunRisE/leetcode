package main.math;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PowerofFour342Test {

    private PowerofFour342 solution;

    @BeforeEach
    void setUp() {
        this.solution = new PowerofFour342();
    }

    @Test
    void isPowerOfFour() {
        assertEquals(true, solution.isPowerOfFour(16));
    }

    @Test
    void isPowerOfFour2() {
        assertEquals(false, solution.isPowerOfFour(5));
    }

    @Test
    public void exampleTest3() {
        assertTrue(solution.isPowerOfFour(1));
    }

    @Test
    public void largeNumberTest() {
        assertFalse(solution.isPowerOfFour(2147483646));
    }

    @Test
    public void negativeNumberTest() {
        assertFalse(solution.isPowerOfFour(-16));
    }

}