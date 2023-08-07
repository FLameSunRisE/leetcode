package test.string;

import main.string.CountAndSay38;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CountAndSay38Test {

  private CountAndSay38 solution;

  @BeforeEach
  void setUp() {
    this.solution = new CountAndSay38();
  }

  @Test
  public void testCountAndSay() {
    // 測試用例1
    int n1 = 1;
    String expected1 = "1";
    Assertions.assertEquals(expected1, solution.countAndSay(n1));

    // 測試用例2
    int n2 = 4;
    String expected2 = "1211";
    Assertions.assertEquals(expected2, solution.countAndSay(n2));

    // 測試用例3
    int n3 = 6;
    String expected3 = "312211";
    Assertions.assertEquals(expected3, solution.countAndSay(n3));
  }

}