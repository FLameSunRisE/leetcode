package test.array;

import main.array.ContainerWithMostWater11;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContainerWithMostWater11Test {

  private ContainerWithMostWater11 solution;

  @BeforeEach
  void setUp() {
    this.solution = new ContainerWithMostWater11();
  }

  @Test
  void maxArea() {
    // Example 1
    int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    int expected1 = 49;
    int result1 = solution.maxArea(height1);
    Assertions.assertEquals(expected1, result1);

    // Example 2
    int[] height2 = {1, 1};
    int expected2 = 1;
    int result2 = solution.maxArea(height2);
    Assertions.assertEquals(expected2, result2);

    // Example 3
    int[] height3 = {4, 3, 2, 1, 4};
    int expected3 = 16;
    int result3 = solution.maxArea(height3);
    Assertions.assertEquals(expected3, result3);

    // Example 4
    int[] height4 = {1, 2, 1};
    int expected4 = 2;
    int result4 = solution.maxArea(height4);
    Assertions.assertEquals(expected4, result4);
  }
}