package main.dp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MinCostClimbingStairs746Test {

  private MinCostClimbingStairs746 solution;

  @BeforeEach
  void setUp() {
    this.solution = new MinCostClimbingStairs746();
  }

  @Test
  void test1() {
    int[] cost = {10, 15, 20};
    int expected = 15;
    int actual = solution.minCostClimbingStairs(cost);
    assertEquals(expected, actual);
  }

  @Test
  void test2() {
    int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
    int expected = 6;
    int actual = solution.minCostClimbingStairs(cost);
    assertEquals(expected, actual);
  }

  @Test
  void test3() {
    int[] cost = {0, 0, 0, 0};
    int expected = 0;
    int actual = solution.minCostClimbingStairs(cost);
    assertEquals(expected, actual);
  }
}