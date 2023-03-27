package test.string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import main.string.FindTheDifference389;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FindTheDifference389Test {

  private FindTheDifference389 solution;

  @BeforeEach
  void setUp() {
    solution = new FindTheDifference389();
  }


  @Test
  void testFindTheDifference() {
    // test case 1
    String s1 = "abcd";
    String t1 = "abcde";
    char expected1 = 'e';
    char result1 = solution.findTheDifference(s1, t1);
    assertEquals(expected1, result1);

    // test case 2
    String s2 = "";
    String t2 = "a";
    char expected2 = 'a';
    char result2 = solution.findTheDifference(s2, t2);
    assertEquals(expected2, result2);

    // test case 3
    String s3 = "a";
    String t3 = "aa";
    char expected3 = 'a';
    char result3 = solution.findTheDifference(s3, t3);
    assertEquals(expected3, result3);

    // test case 4
    String s4 = "xyz";
    String t4 = "xyza";
    char expected4 = 'a';
    char result4 = solution.findTheDifference(s4, t4);
    assertEquals(expected4, result4);
  }
}
