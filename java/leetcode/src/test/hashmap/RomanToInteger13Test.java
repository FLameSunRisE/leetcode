package test.hashmap;

import static org.junit.jupiter.api.Assertions.*;

import main.hashmap.RomanToInteger13;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RomanToInteger13Test {

  private RomanToInteger13 solution;

  @BeforeEach
  void setUp() {
    this.solution = new RomanToInteger13();
  }

  @Test
  void testRomanToInt() {
    assertEquals(3, this.solution.romanToInt("III"));
    assertEquals(4, this.solution.romanToInt("IV"));
    assertEquals(9, this.solution.romanToInt("IX"));
    assertEquals(58, this.solution.romanToInt("LVIII"));
    assertEquals(1994, this.solution.romanToInt("MCMXCIV"));
  }
}