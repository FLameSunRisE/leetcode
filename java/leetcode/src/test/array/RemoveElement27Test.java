package test.array;

import static org.junit.jupiter.api.Assertions.*;

import main.array.RemoveElement27;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveElement27Test {
  private RemoveElement27 solution;

  @BeforeEach
  void setUp() {
    this.solution = new RemoveElement27();
  }

  @Test
  void removeElement() {
    int[] nums = {3, 2, 2, 3};
    int val = 3;
    int expectedLength = 2;

    int length = solution.removeElement(nums, val);

    assertEquals(expectedLength, length);
    for (int i = 0; i < expectedLength; i++) {
      assertNotEquals(val, nums[i]);
    }
  }

  @Test
  void removeElement1(){
    int[] nums = {0,1,2,2,3,0,4,2};
    int val = 2;
    int expectedLength = 5;

    int length = solution.removeElement(nums, val);

    assertEquals(expectedLength, length);
    for (int i = 0; i < expectedLength; i++) {
      assertNotEquals(val, nums[i]);
    }
  }

  @Test
  void removeElement2(){
    int[] nums = {1};
    int val = 1;
    int expectedLength = 0;

    int length = solution.removeElement(nums, val);

    assertEquals(expectedLength, length);
    for (int i = 0; i < expectedLength; i++) {
      assertNotEquals(val, nums[i]);
    }
  }

  @Test
  void removeElement3(){
    int[] nums = {1};
    int val = 2;
    int expectedLength = 1;

    int length = solution.removeElement(nums, val);

    assertEquals(expectedLength, length);
    for (int i = 0; i < expectedLength; i++) {
      assertNotEquals(val, nums[i]);
    }
  }

  @Test
  void removeElement4(){
    int[] nums = {3,3};
    int val = 5;
    int expectedLength = 2;

    int length = solution.removeElement(nums, val);

    assertEquals(expectedLength, length);
    for (int i = 0; i < expectedLength; i++) {
      assertNotEquals(val, nums[i]);
    }
  }

  @Test
  void removeElement5(){
    int[] nums = {4,5};
    int val = 4;
    int expectedLength = 1;

    int length = solution.removeElement(nums, val);

    assertEquals(expectedLength, length);
    for (int i = 0; i < expectedLength; i++) {
      assertNotEquals(val, nums[i]);
    }
  }
}