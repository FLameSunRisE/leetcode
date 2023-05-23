package main.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import main.utils.PrintUtil;

public class LongestSubstringWithoutRepeatingCharacters3 {

  private PrintUtil printUtil = new PrintUtil();

  public int lengthOfLongestSubstring(String s) {
    return this.lengthOfLongestSubstring_leetcode_solution(s);
    //    return this.lengthOfLongestSubstring_first(s);
  }

  private int lengthOfLongestSubstring_first(String s) {
    System.out
        .println("LongestSubstringWithoutRepeatingCharacters3.lengthOfLongestSubstring_first");
    if (s == null || s.length() == 0) {
      return 0;
    }

    int maxLength = 0;
    int start = 0;
    int end = 0;
    Map<Character, Integer> map = new HashMap<>();

    while (end < s.length()) {
      char c = s.charAt(end);
      System.out.println("char: " + c + ", index: " + end);
      if (map.containsKey(c)) {
        start = Math.max(start, map.get(c) + 1);
      }
      map.put(c, end);
      maxLength = Math.max(maxLength, end - start + 1);
      System.out.println("end(" + end + ") - start(" + start + ") + 1 = " + (end - start + 1));
      System.out.println("maxLength = " + maxLength);
      System.out.println("map = " + map.toString());
      end++;
    }
    return maxLength;
  }

  public int lengthOfLongestSubstring_leetcode_solution(String s) {
    System.out.println(
        "LongestSubstringWithoutRepeatingCharacters3.lengthOfLongestSubstring_leetcode_solution");
    if (s == null || s.length() == 0) {
      return 0;
    }

    int maxLength = 0;
    int left = 0;
    Set<Character> set = new HashSet<>();

    for (int right = 0; right < s.length(); right++) {
      char c = s.charAt(right);
      System.out.println("char: " + c + ", index: " + right + "-------------");
      if (!set.contains(c)) {
        set.add(c);
        maxLength = Math.max(maxLength, right - left + 1);
        System.out.println("right(" + right + ") - left(" + left + ") + 1 = " + (right - left + 1));
      } else {
        while (left < right && s.charAt(left) != c) {
          System.out.println("[while] before set = " + printUtil.printSet(set));
          set.remove(s.charAt(left));
          System.out.println("[while] after set = " + printUtil.printSet(set));
          left++;
        }
        System.out.println("right = " + right + ", left = " + left);
        if (left < right) {
          set.remove(s.charAt(left));
          System.out.println("[left < right] after set = " + printUtil.printSet(set));
          left++;
        }
        set.add(c);
        System.out.println("[set.add(c)] after set = " + printUtil.printSet(set));
      }
    }
    return maxLength;
  }

}
