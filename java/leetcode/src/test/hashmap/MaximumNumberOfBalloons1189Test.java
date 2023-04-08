package test.hashmap;

import static org.junit.jupiter.api.Assertions.*;

import main.hashmap.MaximumNumberOfBalloons1189;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaximumNumberOfBalloons1189Test {

  private MaximumNumberOfBalloons1189 solution;
  @BeforeEach
  void setUp() {
    this.solution = new MaximumNumberOfBalloons1189();
  }

  @Test
  void maxNumberOfBalloons() {
    String text = "nlaebolko";
    int expected = 1;
    int actual = solution.maxNumberOfBalloons(text);
    assertEquals(expected, actual);
  }

  @Test
  void maxNumberOfBalloons2() {
    String text = "loonbalxballpoon";
    int expected = 2;
    int actual = solution.maxNumberOfBalloons(text);
    assertEquals(expected, actual);
  }

  @Test
  void maxNumberOfBalloons3() {
    String text = "leetcode";
    int expected = 0;
    int actual = solution.maxNumberOfBalloons(text);
    assertEquals(expected, actual);
  }

  @Test
  void maxNumberOfBalloons4() {
    String text = "balon";
    int expected = 0;
    int actual = solution.maxNumberOfBalloons(text);
    assertEquals(expected, actual);
  }

  @Test
  void maxNumberOfBalloons5() {
    String text = "ballon";
    int expected = 0;
    int actual = solution.maxNumberOfBalloons(text);
    assertEquals(expected, actual);
  }

  @Test
  void maxNumberOfBalloons6() {
    String text = "balloon";
    int expected = 1;
    int actual = solution.maxNumberOfBalloons(text);
    assertEquals(expected, actual);
  }

  @Test
  void maxNumberOfBalloons7() {
    String text = "balloons";
    int expected = 1;
    int actual = solution.maxNumberOfBalloons(text);
    assertEquals(expected, actual);
  }
}