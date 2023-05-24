package test.array;

import java.util.Arrays;
import java.util.List;
import main.array.ThreeSum15;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ThreeSum15Test {

  private ThreeSum15 solution;

  @BeforeEach
  void setUp() {
    this.solution = new ThreeSum15();
  }

  @Test
  public void testThreeSum() {
    int[] nums = {-1, 0, 1, 2, -1, -4};
    List<List<Integer>> expected = Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1));

    List<List<Integer>> result = solution.threeSum(nums);

    Assertions.assertEquals(expected, result);
  }

  @Test
  void threeSum_2() {
    int[] nums = {0, 1, 1};
    List<List<Integer>> expected = Arrays.asList();

    List<List<Integer>> result = solution.threeSum(nums);

    Assertions.assertEquals(expected, result);
  }

  @Test
  void threeSum_3() {
    int[] nums = {0, 0, 0};
    List<List<Integer>> expected = Arrays.asList(Arrays.asList(0, 0, 0));

    List<List<Integer>> result = solution.threeSum(nums);

    Assertions.assertEquals(expected, result);
  }
}