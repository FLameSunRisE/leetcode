package test.twopoint;

import main.twopoint.ReverseStringII541;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReverseStringII541Test {

    private ReverseStringII541 solution;

    @BeforeEach
    void setUp() {
        this.solution = new ReverseStringII541();
    }

    @Test
    public void exampleTest() {
        String s = "abcdefg";
        int k = 2;
        String expected = "bacdfeg";
        String actual = solution.reverseStr(s, k);
        assertArrayEquals(expected.toCharArray(), actual.toCharArray());
    }

    @Test
    public void testEmptyString() {
        String s = "";
        int k = 2;
        String expected = "";
        String actual = solution.reverseStr(s, k);
        assertArrayEquals(expected.toCharArray(), actual.toCharArray());
    }

    @Test
    public void testSingleCharacterString() {
        String s = "a";
        int k = 2;
        String expected = "a";
        String actual = solution.reverseStr(s, k);
        assertArrayEquals(expected.toCharArray(), actual.toCharArray());
    }

    @Test
    public void testKEqualsOne() {
        String s = "abcdefg";
        int k = 1;
        String expected = "abcdefg";
        String actual = solution.reverseStr(s, k);
        assertArrayEquals(expected.toCharArray(), actual.toCharArray());
    }

    @Test
    public void testKEqualsStringLength() {
        String s = "abcdefg";
        int k = s.length();
        String expected = "gfedcba";
        String actual = solution.reverseStr(s, k);
        assertArrayEquals(expected.toCharArray(), actual.toCharArray());
    }

    @Test
    public void testKGreaterThanStringLength() {
        String s = "abcdefg";
        int k = s.length() + 1;
        String expected = "gfedcba";
        String actual = solution.reverseStr(s, k);
        assertArrayEquals(expected.toCharArray(), actual.toCharArray());
    }
}