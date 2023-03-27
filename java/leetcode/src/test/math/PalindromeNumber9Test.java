package test.math;

import static org.junit.jupiter.api.Assertions.*;

import main.math.PalindromeNumber9;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PalindromeNumber9Test {

  private PalindromeNumber9 solution;

  @BeforeEach
  void setUp() {
    this.solution = new PalindromeNumber9();
  }

  @Test
  public void testIsPalindrome() {
    // Test cases with palindromic numbers
    Assertions.assertTrue(solution.isPalindrome(0));
    Assertions.assertTrue(solution.isPalindrome(121));
    Assertions.assertTrue(solution.isPalindrome(1221));
    Assertions.assertTrue(solution.isPalindrome(12321));
    Assertions.assertTrue(solution.isPalindrome(1234321));

    // Test cases with non-palindromic numbers
    Assertions.assertFalse(solution.isPalindrome(-121));
    Assertions.assertFalse(solution.isPalindrome(10));
    Assertions.assertFalse(solution.isPalindrome(123));
    Assertions.assertFalse(solution.isPalindrome(1234));
  }
}