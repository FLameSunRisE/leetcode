package main.hashmap;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger13 {

  /**
   * romanToInt. time complexity: O(n) space complexity: O(1)
   *
   * @param s
   * @return int
   */
  public int romanToInt(String s) {
    // init symbol mapping
    Map<Character, Integer> symbolMap = initSymboMap();

    int result = 0;
    for (int i = 0; i < s.length(); i++) {
      int value = symbolMap.get(s.charAt(i));
      if (i < s.length() - 1 && value < symbolMap.get(s.charAt(i + 1))) {
        result -= value;
      } else {
        result += value;
      }
    }
    return result;
  }

  /**
   * romanToInt. time complexity: O(n) space complexity: O(1)
   *
   * @param s
   * @return int
   */
  public int romanToInt_opt(String s) {
    Map<Character, Integer> symbolMap = initSymboMap();

    int result = 0;
    int prev = 0;
    for (int i = s.length() - 1; i >= 0; i--) {
      int curr = symbolMap.get(s.charAt(i));
      if (curr < prev) {
        result -= curr;
      } else {
        result += curr;
      }
      prev = curr;
    }
    return result;
  }

  private Map<Character, Integer> initSymboMap() {
    Map<Character, Integer> symbolMap = new HashMap<>();
    symbolMap.put('I', 1);
    symbolMap.put('V', 5);
    symbolMap.put('X', 10);
    symbolMap.put('L', 50);
    symbolMap.put('C', 100);
    symbolMap.put('D', 500);
    symbolMap.put('M', 1000);
    return symbolMap;
  }
}
