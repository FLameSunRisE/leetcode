package main.string;

public class LongestCommonPrefix14 {

  /**
   * longestCommonPrefix. time complexity: O(n) space complexity: O(1)`
   *
   * @param strs
   * @return {@link String }
   */
  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) {
      return "";
    }

    int minLen = Integer.MAX_VALUE;
    for (String str : strs) {
      minLen = Math.min(minLen, str.length());
    }

    for (int i = 0; i < minLen; i++) {
      char c = strs[0].charAt(i);
      for (int j = 1; j < strs.length; j++) {
        if (strs[j].charAt(i) != c) {
          return strs[0].substring(0, i);
        }
      }
    }
    return strs[0].substring(0, minLen);
  }


  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) {
      return "";
    }

    int minLen = Integer.MAX_VALUE;
    for (String str : strs) {
      minLen = Math.min(minLen, str.length());
    }

    int left = 0;
    int right = minLen;
    while (left < minLen) {
      int mid = (left + minLen) / 2;
      // 比較是否依樣
      if (isSameString(strs, mid)) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return strs[0].substring(0, (left + right) / 2);
  }

  private boolean isSameString(String[] strs, int mid) {
    String prefix = strs[0].substring(0, mid);
    for (int i = 1; i < strs.length; i++) {
      if (!strs[i].startsWith(prefix)) {
        return false;
      }
    }
    return true;
  }
}
