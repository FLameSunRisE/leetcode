package leetcode.src.test.dp;

import leetcode.src.main.dp.IsSubsequence392;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSubsequence392Test {

    private IsSubsequence392 solution;

    @BeforeEach
    void setUp() {
        this.solution = new IsSubsequence392();
    }

    @Test
    void isSubsequence() {
        String s = "abc", t = "ahbgdc";
        boolean result = solution.isSubsequence(s, t);
        assertEquals(true, result);
    }

    @Test
    void isSubsequence2() {
        String s = "axc", t = "ahbgdc";
        boolean result = solution.isSubsequence(s, t);
        assertEquals(false, result);
    }
}