package main.string;

import java.util.Arrays;

/**
 * FindTheDifference389.
 *
 * @author jay
 * @version 1.0.0
 * @date 2023/03/27
 */
public class FindTheDifference389 {

  public char findTheDifference(String s, String t) {
    char[] sCharArray = s.toCharArray();
    Arrays.sort(sCharArray);
    char[] tCharArray = t.toCharArray();
    Arrays.sort(tCharArray);
    for (int i = 0; i < tCharArray.length - 1; i++) {
      if (sCharArray[i] != tCharArray[i]) {
        return tCharArray[i];
      }
    }
    return tCharArray[t.length() - 1];
  }

  public char findTheDifference_solution2(String s, String t) {
    int sum = 0;
    for (char c : s.toCharArray()) {
      sum += c;
    }
    for (char c : t.toCharArray()) {
      sum -= c;
    }
    return (char) (-sum);
  }

}
