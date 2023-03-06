package leetcode.src.test.string;

import leetcode.src.main.string.LongestPalindrome409;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindrome409Test {

    private LongestPalindrome409 solution;

    @BeforeEach
    void setUp() {
        this.solution = new LongestPalindrome409();
    }

//    @Test
//    void longestPalindrome() {
//    }

    @ParameterizedTest
    @CsvSource({
            "abccccdd, 7",
            "aA, 1",
            "abc, 1",
            "bb, 2",
            "bananas, 5"
    })
    void testLongestPalindrome(String s, int expected) {
        int result = solution.longestPalindrome(s);
        Assertions.assertEquals(expected, result);
    }
}