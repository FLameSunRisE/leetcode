package test.string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import main.string.LongestSubstringWithoutRepeatingCharacters3;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LongestSubstringWithoutRepeatingCharacters3Test {

  private LongestSubstringWithoutRepeatingCharacters3 solution;

  @BeforeEach
  void setUp() {
    this.solution = new LongestSubstringWithoutRepeatingCharacters3();
  }

  @Test
  void lengthOfLongestSubstring() {
    String s = "abcabcbb";
    int expected = 3;
    int actual = this.solution.lengthOfLongestSubstring(s);
    assertEquals(expected, actual);
  }

  @Test
  void lengthOfLongestSubstring2() {
    String s = "bbbbb";
    int expected = 1;
    int actual = this.solution.lengthOfLongestSubstring(s);
    assertEquals(expected, actual);
  }

  @Test
  void lengthOfLongestSubstring3() {
    String s = "pwwkew";
    int expected = 3;
    int actual = this.solution.lengthOfLongestSubstring(s);
    assertEquals(expected, actual);
  }

  @Test
  void lengthOfLongestSubstring4() {
    String s = "";
    int expected = 0;
    int actual = this.solution.lengthOfLongestSubstring(s);
    assertEquals(expected, actual);
  }

  @Test
  void lengthOfLongestSubstring5() {
    String s = " ";
    int expected = 1;
    int actual = this.solution.lengthOfLongestSubstring(s);
    assertEquals(expected, actual);
  }

  @Test
  void lengthOfLongestSubstring6() {
    String s = "au";
    int expected = 2;
    int actual = this.solution.lengthOfLongestSubstring(s);
    assertEquals(expected, actual);
  }

  @Test
  void lengthOfLongestSubstring7() {
    String s = "dvdf";
    int expected = 3;
    int actual = this.solution.lengthOfLongestSubstring(s);
    assertEquals(expected, actual);
  }

  @Test
  void lengthOfLongestSubstring8() {
    String s = "abba";
    int expected = 2;
    int actual = this.solution.lengthOfLongestSubstring(s);
    assertEquals(expected, actual);
  }
}