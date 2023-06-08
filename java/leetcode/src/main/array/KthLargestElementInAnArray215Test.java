package main.array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class KthLargestElementInAnArray215Test {

  public KthLargestElementInAnArray215 solution;

  @BeforeEach
  void setUp() {
    solution = new KthLargestElementInAnArray215();
  }

  @Test
  public void testKthLargestElement_Case1() {
    int[] nums = {3, 2, 1, 5, 6, 4};
    int k = 2;
    int expected = 5;

    int result = solution.findKthLargest(nums, k);

    Assertions.assertEquals(expected, result);
  }

  @Test
  public void testKthLargestElement_Case2() {
    int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
    int k = 4;
    int expected = 4;

    int result = solution.findKthLargest(nums, k);

    Assertions.assertEquals(expected, result);
  }
}