package test.array;

import static org.junit.jupiter.api.Assertions.*;

import main.array.MajorityElement169;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MajorityElement169Test {

  private MajorityElement169 solution;

  @BeforeEach
  void setUp() {
    this.solution = new MajorityElement169();
  }

  @Test
  void test1() {
    int[] nums = {3,2,3};
    int expected = 3;
    int actual = solution.majorityElement(nums);
    assertEquals(expected, actual);
  }

  @Test
  void test2() {
    int[] nums = {2,2,1,1,1,2,2};
    int expected = 2;
    int actual = solution.majorityElement(nums);
    assertEquals(expected, actual);
  }

  @Test
  void test3() {
    int[] nums = {1};
    int expected = 1;
    int actual = solution.majorityElement(nums);
    assertEquals(expected, actual);
  }
}