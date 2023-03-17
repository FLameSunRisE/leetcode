package test.array;

import static org.junit.jupiter.api.Assertions.*;

import main.array.ContainsDuplicate217;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContainsDuplicate217Test {

  private ContainsDuplicate217 solution;

  @BeforeEach
  void setUp() {
    this.solution = new ContainsDuplicate217();
  }

  @Test
  void testContainsDuplicate() {
    int[] nums1 = {1, 2, 3, 1};
    assertTrue(solution.containsDuplicate(nums1));

    int[] nums2 = {1, 2, 3, 4};
    assertFalse(solution.containsDuplicate(nums2));

    int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
    assertTrue(solution.containsDuplicate(nums3));
  }
}