package test.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import main.hashmap.LetterCombinationsOfAPhoneNumber17;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LetterCombinationsOfAPhoneNumber17Test {

  private LetterCombinationsOfAPhoneNumber17 solution;

  @BeforeEach
  void setUp() {
    this.solution = new LetterCombinationsOfAPhoneNumber17();
  }

  @Test
  public void testLetterCombinations() {
    String digits = "23";
    List<String> expected = new ArrayList<>(
        Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));
    List<String> result = solution.letterCombinations(digits);
    Assertions.assertEquals(expected, result);
  }

  @Test
  public void testLetterCombinations_EmptyInput() {
    String digits = "";
    List<String> expected = new ArrayList<>();
    List<String> result = solution.letterCombinations(digits);
    Assertions.assertEquals(expected, result);
  }

  @Test
  public void testLetterCombinations_Zeroes() {
    String digits = "00";
    List<String> expected = new ArrayList<>();
    List<String> result = solution.letterCombinations(digits);
    Assertions.assertEquals(expected, result);
  }

  @Test
  public void testLetterCombinations_InvalidDigits() {
    String digits = "123";
    List<String> expected = new ArrayList<>();
    List<String> result = solution.letterCombinations(digits);
    Assertions.assertEquals(expected, result);
  }

}