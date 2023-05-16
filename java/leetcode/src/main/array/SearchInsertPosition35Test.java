package main.array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SearchInsertPosition35Test {

  private SearchInsertPosition35 solution;

  @BeforeEach
  void setUp() {
    this.solution = new SearchInsertPosition35();
  }

  @Test
  void testSearchInsert() {

    // 測試案例1
    int[] nums1 = {1, 3, 5, 6};
    int target1 = 5;
    int expected1 = 2;
    int result1 = solution.searchInsert(nums1, target1);
    assertEquals(expected1, result1);

    // 測試案例2
    int[] nums2 = {1, 3, 5, 6};
    int target2 = 2;
    int expected2 = 1;
    int result2 = solution.searchInsert(nums2, target2);
    assertEquals(expected2, result2);

    // 測試案例3
    int[] nums3 = {1, 3, 5, 6};
    int target3 = 7;
    int expected3 = 4;
    int result3 = solution.searchInsert(nums3, target3);
    assertEquals(expected3, result3);

    // 測試案例4
    int[] nums4 = {1, 3, 5, 6};
    int target4 = 0;
    int expected4 = 0;
    int result4 = solution.searchInsert(nums4, target4);
    assertEquals(expected4, result4);
  }
}