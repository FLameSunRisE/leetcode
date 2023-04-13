package test.dp;

import main.dp.GenerateParentheses22;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class GenerateParentheses22Test {

    private GenerateParentheses22 solution;

    @BeforeEach
    void setUp() {
        this.solution = new GenerateParentheses22();
    }

    @Test
    public void exampleTest() {
        String[] expected = {"()"};
        String[] actual = solution.generateParenthesis(1).toArray(new String[0]);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testTwo() {
        String[] expected = {"(())", "()()"};
        String[] actual = solution.generateParenthesis(2).toArray(new String[0]);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testThree() {
        String[] expected = {"((()))", "(()())", "(())()", "()(())", "()()()"};
        String[] actual = solution.generateParenthesis(3).toArray(new String[0]);
        assertArrayEquals(expected, actual);
    }
}