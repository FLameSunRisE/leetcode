package test.dp;

import main.binarysearch.FirstBadVersion278;
import main.dp.FibonacciNumber509;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciNumber509Test {
    private FibonacciNumber509 solution;

    @BeforeEach
    public void setUp() {
        this.solution = new FibonacciNumber509();
    }

    @Test
    public void testFibonacci() {
        assertEquals(0, solution.fib(0));
        assertEquals(1, solution.fib(1));
        assertEquals(1, solution.fib(2));
        assertEquals(2, solution.fib(3));
        assertEquals(3, solution.fib(4));
        assertEquals(5, solution.fib(5));
        assertEquals(8, solution.fib(6));
        assertEquals(13, solution.fib(7));
        assertEquals(21, solution.fib(8));
        assertEquals(34, solution.fib(9));
        assertEquals(55, solution.fib(10));
    }
}