package main.array;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContainsDuplicateII219Test {

  private ContainsDuplicateII219 solution;

  @BeforeEach
  void setUp() {
    this.solution = new ContainsDuplicateII219();
  }


  @Test
  void testContainsNearbyDuplicate() {
    int[] nums1 = {1, 2, 3, 1};
    int k1 = 3;
    assertTrue(solution.containsNearbyDuplicate(nums1, k1));

    int[] nums2 = {1, 0, 1, 1};
    int k2 = 1;
    assertTrue(solution.containsNearbyDuplicate(nums2, k2));

    int[] nums3 = {1, 2, 3, 1, 2, 3};
    int k3 = 2;
    assertFalse(solution.containsNearbyDuplicate(nums3, k3));
  }
}