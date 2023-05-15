package test.string;

import main.string.FindTheIndexOfTheFirstOccurrenceInAString28;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FindTheIndexOfTheFirstOccurrenceInAString28Test {

  private FindTheIndexOfTheFirstOccurrenceInAString28 solution;
  @BeforeEach
  void setUp() {
    this.solution = new FindTheIndexOfTheFirstOccurrenceInAString28();
  }

  @Test
  public void testFirstOccurrence() {
    // Example test cases
    Assertions.assertEquals(2, solution.strStr("hello", "ll"));
    Assertions.assertEquals(-1, solution.strStr("aaaaa", "bba"));
    Assertions.assertEquals(-1, solution.strStr("", "a"));
    Assertions.assertEquals(0, solution.strStr("a", ""));
    Assertions.assertEquals(0, solution.strStr("abc", "a"));
    Assertions.assertEquals(1, solution.strStr("abc", "b"));
    Assertions.assertEquals(2, solution.strStr("abc", "c"));

    // Additional test cases
    Assertions.assertEquals(-1, solution.strStr("hello", "world"));
    Assertions.assertEquals(0, solution.strStr("hello", "h"));
    Assertions.assertEquals(1, solution.strStr("hello", "e"));
    Assertions.assertEquals(3, solution.strStr("hello", "l"));
    Assertions.assertEquals(4, solution.strStr("hello", "o"));
    Assertions.assertEquals(2, solution.strStr("mississippi", "ss"));
  }
}