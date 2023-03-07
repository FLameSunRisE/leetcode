package test.binarysearch;

import static org.junit.jupiter.api.Assertions.*;

import main.binarysearch.BinarySearch704;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinarySearch704Test {
  private BinarySearch704 solution;

  @BeforeEach
  void setUp() {
    this.solution = new BinarySearch704();
  }

  @Test
  void testBinarySearch_Case1() {
    int[] nums = {-1, 0, 3, 5, 9, 12};
    int target = 9;
    int expected = 4;
    int actual = solution.search(nums, target);
    assertEquals(expected, actual);
  }

  @Test
  void testBinarySearch_Case2() {
    int[] nums = {-1, 0, 3, 5, 9, 12};
    int target = 2;
    int expected = -1;
    int actual = solution.search(nums, target);
    assertEquals(expected, actual);
  }
}