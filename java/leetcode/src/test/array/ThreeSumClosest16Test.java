package test.array;

import main.array.ThreeSumClosest16;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ThreeSumClosest16Test {

  private ThreeSumClosest16 solution;

  @BeforeEach
  void setUp() {
    this.solution = new ThreeSumClosest16();
  }

  @Test
  public void testThreeSumClosestExample1() {
    int[] nums = {-1, 2, 1, -4};
    int target = 1;
    int expected = 2;
    int result = solution.threeSumClosest(nums, target);
    Assertions.assertEquals(expected, result);
  }

  @Test
  public void testThreeSumClosestExample2() {
    int[] nums = {0, 0, 0};
    int target = 1;
    int expected = 0;
    int result = solution.threeSumClosest(nums, target);
    Assertions.assertEquals(expected, result);
  }

  @Test
  public void testThreeSumClosestAdditional1() {
    int[] nums = {1, 1, 1, 0};
    int target = -100;
    int expected = 2;
    int result = solution.threeSumClosest(nums, target);
    Assertions.assertEquals(expected, result);
  }

  @Test
  public void testThreeSumClosestAdditional2() {
    int[] nums = {4, 2, 5, 1, 3, -1, 6};
    int target = 7;
    int expected = 7;
    int result = solution.threeSumClosest(nums, target);
    Assertions.assertEquals(expected, result);
  }
}