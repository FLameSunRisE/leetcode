package test.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import main.array.RemoveDuplicatesFromSortedArray26;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesFromSortedArray26Test {

  private RemoveDuplicatesFromSortedArray26 solution;

  @BeforeEach
  void setUp() {
    this.solution = new RemoveDuplicatesFromSortedArray26();
  }

  @Test
  void removeDuplicates() {
    int[] nums = {1, 1, 2};
    int[] expectedNums = {1, 2};
    int expectedLength = 2;

    int length = solution.removeDuplicates(nums);

    assertEquals(expectedLength, length);
    for (int i = 0; i < expectedLength; i++) {
      assertEquals(expectedNums[i], nums[i]);
    }
  }

  @Test
  void removeDuplicates2() {
    int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    int[] expectedNums = {0, 1, 2, 3, 4};
    int expectedLength = 5;

    int length = solution.removeDuplicates(nums);

    assertEquals(expectedLength, length);
    for (int i = 0; i < expectedLength; i++) {
      assertEquals(expectedNums[i], nums[i]);
    }
  }

  @Test
  void removeDuplicates3() {
    int[] nums = {1, 2};
    int[] expectedNums = {1, 2};
    int expectedLength = 2;

    int length = solution.removeDuplicates(nums);

    assertEquals(expectedLength, length);
    for (int i = 0; i < expectedLength; i++) {
      assertEquals(expectedNums[i], nums[i]);
    }
  }

  @Test
  void removeDuplicates4() {
    int[] nums = {1, 1};
    int[] expectedNums = {1};
    int expectedLength = 1;

    int length = solution.removeDuplicates(nums);

    assertEquals(expectedLength, length);
    for (int i = 0; i < expectedLength; i++) {
      assertEquals(expectedNums[i], nums[i]);
    }
  }

}