package test.string;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import main.string.ValidParentheses20;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidParentheses20Test {

  private ValidParentheses20 solution;

  @BeforeEach
  void setUp() {
    this.solution = new ValidParentheses20();
  }

  @Test
  void exampleTest1() {
    assertTrue(solution.isValid("()"));
  }

  @Test
  void exampleTest2() {
    assertTrue(solution.isValid("()[]{}"));
  }

  @Test
  void exampleTest3() {
    assertFalse(solution.isValid("(]"));
  }

  @Test
  void exampleTest4() {
    assertFalse(solution.isValid("([)]"));
  }

  @Test
  void exampleTest5() {
    assertTrue(solution.isValid("{[]}"));
  }

  @Test
  void emptyStringTest() {
    assertTrue(solution.isValid(""));
  }

  @Test
  void singleCharTest() {
    assertFalse(solution.isValid("("));
  }
}