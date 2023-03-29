package test.math;

import main.math.ExcelSheetColumnNumber171;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExcelSheetColumnNumber171Test {

    private ExcelSheetColumnNumber171 solution;

    @BeforeEach
    void setUp() {
        this.solution = new ExcelSheetColumnNumber171();
    }

    @Test
    public void testExample1() {
        int actual = solution.titleToNumber("A");
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testExample2() {
        int actual = solution.titleToNumber("AB");
        int expected = 28;
        assertEquals(expected, actual);
    }

    @Test
    public void testExample3() {
        int actual = solution.titleToNumber("ZY");
        int expected = 701;
        assertEquals(expected, actual);
    }

    @Test
    public void testSingleChar() {
        int actual = solution.titleToNumber("Z");
        int expected = 26;
        assertEquals(expected, actual);
    }

    @Test
    public void testEmptyString() {
        int actual = solution.titleToNumber("");
        int expected = 0;
        assertEquals(expected, actual);
    }
}