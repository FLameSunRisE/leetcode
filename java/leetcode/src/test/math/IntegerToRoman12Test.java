package test.math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import main.math.IntegerToRoman12;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IntegerToRoman12Test {

  private IntegerToRoman12 solution;

  @BeforeEach
  void setUp() {
    this.solution = new IntegerToRoman12();
  }

  @Test
  void intToRoman() {
    assertEquals("III", this.solution.intToRoman(3));
    assertEquals("IV", this.solution.intToRoman(4));
    assertEquals("IX", this.solution.intToRoman(9));
    assertEquals("LVIII", this.solution.intToRoman(58));
    assertEquals("MCMXCIV", this.solution.intToRoman(1994));
  }
}