package test.string;

import static org.junit.jupiter.api.Assertions.*;

import main.string.LongestCommonPrefix14;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LongestCommonPrefix14Test {

  private LongestCommonPrefix14 solution;

  @BeforeEach
  void setUp() {
    this.solution = new LongestCommonPrefix14();
  }

  @Test
  void longestCommonPrefix() {
    String[] strs = {"flower", "flow", "flight"};
    assertEquals("fl", this.solution.longestCommonPrefix(strs));
    strs = new String[]{"dog", "racecar", "car"};
    assertEquals("", this.solution.longestCommonPrefix(strs));
    strs = new String[]{"ab", "a"};
    assertEquals("a", this.solution.longestCommonPrefix(strs));
  }

  @Test
  void testLongestCommonPrefix() {
    String[] strs1 = {"flower", "flow", "flight"};
    String[] strs2 = {"dog", "racecar", "car"};
    String[] strs3 = {"ab", "a"};
    String[] strs4 = {"ab", "abc", "abcd"};
    String[] strs5 = {"abc", "abc", "abc"};

    assertEquals("fl", solution.longestCommonPrefix(strs1));
    assertEquals("", solution.longestCommonPrefix(strs2));
    assertEquals("a", solution.longestCommonPrefix(strs3));
    assertEquals("ab", solution.longestCommonPrefix(strs4));
    assertEquals("abc", solution.longestCommonPrefix(strs5));
  }
}