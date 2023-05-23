package test.utils;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;
import main.utils.PrintUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrintUtilTest {

  private PrintUtil solution;

  @BeforeEach
  void setUp() {
    this.solution = new PrintUtil();
  }

  @Test
  void printSet() {
    Set<Character> set = new HashSet<>();
    set.add('a');
    set.add('b');
    set.add('c');

    String actualStr = solution.printSet(set);
    System.out.println("actualStr = " + actualStr);

    assertEquals("abc", actualStr);
  }
}