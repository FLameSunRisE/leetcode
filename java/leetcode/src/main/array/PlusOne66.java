package main.array;

/**
 * PlusOne66.
 *
 * @author jayyeh
 * @version 1.0.0
 * @date 2023/05/16
 */
public class PlusOne66 {

  public int[] plusOne(int[] digits) {
//    return this.plusOne_first(digits);
    return this.plusOne_first_opt(digits);
  }

  /**
   * plusOne_first.
   * time complexity: O(n)
   * space complexity: O(n).
   *
   * @param digits
   * @return {@link int[] }
   */
  private int[] plusOne_first(int[] digits) {
    int carry = 1;
    int length = digits.length;
    for (int i = length - 1; i >= 0; i--) {
      int sum = digits[i] + carry;
      if (sum < 10) {
        digits[i] = sum;
        return digits;
      } else {
        digits[i] = sum % 10;
        carry = 1;
      }
    }

    if (carry == 1) {
      int[] newDigits = new int[length + 1];
      newDigits[0] = 1;
      System.arraycopy(digits, 0, newDigits, 1, length);
      return newDigits;
    }
    return digits;
  }

  /**
   * plusOne_first_opt.
   * time complexity: O(n)
   * space complexity: O(n).
   *
   * @param digits
   * @return {@link int[] }
   */
  private int[] plusOne_first_opt(int[] digits) {
    int carry = 1;
    int length = digits.length;
    for (int i = length - 1; i >= 0; i--) {
      int sum = digits[i] + carry;
      digits[i] = sum % 10;
      carry = sum / 10;
      if (carry == 0) {
        return digits;
      }
    }

    int[] newDigits = new int[digits.length + 1];
    newDigits[0] = 1;
    return newDigits;
  }
}
