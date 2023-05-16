package test.array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import main.array.PlusOne66;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlusOne66Test {

  private PlusOne66 solution;

  @BeforeEach
  void setUp() {
    this.solution = new PlusOne66();
  }

  @Test
  public void testPlusOne() {
    int[] digits1 = {1, 2, 3};
    int[] expected1 = {1, 2, 4};
    assertArrayEquals(expected1, solution.plusOne(digits1));

    int[] digits2 = {4, 3, 2, 1};
    int[] expected2 = {4, 3, 2, 2};
    assertArrayEquals(expected2, solution.plusOne(digits2));

    int[] digits3 = {9, 9, 9};
    int[] expected3 = {1, 0, 0, 0};
    assertArrayEquals(expected3, solution.plusOne(digits3));
  }
}