package test.twopoint;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import main.twopoint.LongPressedName925;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LongPressedName925Test {

  private LongPressedName925 solution;

  @BeforeEach
  void setUp() {
    this.solution = new LongPressedName925();
  }

  @Test
  void test1() {
    String name = "alex";
    String typed = "aaleex";
    assertTrue(solution.isLongPressedName(name, typed));
  }

  @Test
  void test2() {
    String name = "saeed";
    String typed = "ssaaedd";
    assertFalse(solution.isLongPressedName(name, typed));
  }

  @Test
  void test3() {
    String name = "leelee";
    String typed = "lleeelee";
    assertTrue(solution.isLongPressedName(name, typed));
  }

  @Test
  void test4() {
    String name = "laiden";
    String typed = "laiden";
    assertTrue(solution.isLongPressedName(name, typed));
  }

  @Test
  void test5() {
    String name = "laiden";
    String typed = "laaiden";
    assertTrue(solution.isLongPressedName(name, typed));
  }
}