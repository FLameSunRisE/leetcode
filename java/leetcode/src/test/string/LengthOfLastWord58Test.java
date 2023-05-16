package test.string;

import main.string.LengthOfLastWord58;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LengthOfLastWord58Test {

  private LengthOfLastWord58 solution;

  @BeforeEach
  void setUp() {
    this.solution = new LengthOfLastWord58();
  }

  @Test
  public void testLengthOfLastWord() {
    // Example 1: Input: s = "Hello World", Output: 5
    Assertions.assertEquals(5, solution.lengthOfLastWord("Hello World"));

    // Example 2: Input: s = "   fly me   to   the moon  ", Output: 4
    Assertions.assertEquals(4, solution.lengthOfLastWord("   fly me   to   the moon  "));

    // Example 3: Input: s = "luffy is still joyboy", Output: 6
    Assertions.assertEquals(6, solution.lengthOfLastWord("luffy is still joyboy"));

    // Additional Test Case: Input: s = "a", Output: 1
    Assertions.assertEquals(1, solution.lengthOfLastWord("a"));

    // Additional Test Case: Input: s = " ", Output: 0
    Assertions.assertEquals(0, solution.lengthOfLastWord(" "));

    // Additional Test Case: Input: s = "Word", Output: 4
    Assertions.assertEquals(4, solution.lengthOfLastWord("Word"));
  }
}