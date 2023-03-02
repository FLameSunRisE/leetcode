package leetcode.src.test.string;

import leetcode.src.main.string.IsIsomorphicString205;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * IsIsomorphicString205Test.
 *
 * @author jayyeh
 * @version 1.0.0
 * @date 2023/03/02
 */
class IsIsomorphicString205Test {
    private IsIsomorphicString205 solution;

    @BeforeEach
    void setUp() {
        this.solution = new IsIsomorphicString205();
    }

    @Test
    void isIsomorphic() {
        String s = "egg", t = "add";
        boolean result = solution.isIsomorphic(s, t);
        assertEquals(true, result);
    }

    @Test
    void isIsomorphic2() {
        String s = "foo", t = "bar";
        boolean result = solution.isIsomorphic(s, t);
        assertEquals(false, result);
    }

    @Test
    void isIsomorphic3() {
        String s = "paper", t = "title";
        boolean result = solution.isIsomorphic(s, t);
        assertEquals(true, result);
    }
}