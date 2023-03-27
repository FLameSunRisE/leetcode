package test.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import main.array.CountDistinctNumbersOnBoard2549;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CountDistinctNumbersOnBoard2549Test {

  private CountDistinctNumbersOnBoard2549 solution;

  @BeforeEach
  void setUp() {
    this.solution = new CountDistinctNumbersOnBoard2549();
  }

  @Test
  void testDistinctIntegers() {

    // test case 1
    int n1 = 5;
    int expected1 = 4;
    int result1 = solution.distinctIntegers(n1);
    assertEquals(expected1, result1);

    // test case 2
    int n2 = 3;
    int expected2 = 2;
    int result2 = solution.distinctIntegers(n2);
    assertEquals(expected2, result2);

    // test case 3
    int n3 = 1;
    int expected3 = 1;
    int result3 = solution.distinctIntegers(n3);
    assertEquals(expected3, result3);
  }
}