package test.array;

import java.util.Arrays;
import java.util.List;
import main.array.FourSum18;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FourSum18Test {

  private FourSum18 solution;

  @BeforeEach
  void setUp() {
    this.solution = new FourSum18();
  }

  @Test
  public void testFourSum() {
    int[] nums = {1, 0, -1, 0, -2, 2};
    int target = 0;
    List<List<Integer>> expected = Arrays.asList(
        Arrays.asList(-2, -1, 1, 2),
        Arrays.asList(-2, 0, 0, 2),
        Arrays.asList(-1, 0, 0, 1)
    );
    List<List<Integer>> result = solution.fourSum(nums, target);
    Assertions.assertEquals(expected, result);
  }

  @Test
  public void testFourSum_fail1() {
    int[] nums = {1000000000, 1000000000, 1000000000, 1000000000};
    int target = -294967296;
    List<List<Integer>> expected = Arrays.asList(
        Arrays.asList(1000000000, 1000000000, 1000000000, 1000000000)
    );
    List<List<Integer>> result = solution.fourSum(nums, target);
    Assertions.assertEquals(expected, result);
  }
}