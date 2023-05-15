package main.string;

/**
 * FindTheIndexOfTheFirstOccurrenceInAString28.
 *
 * @author jayyeh
 * @version 1.0.0
 * @date 2023/05/15
 */
public class FindTheIndexOfTheFirstOccurrenceInAString28 {

  public int strStr(String haystack, String needle) {
    return this.strStr_first(haystack, needle);
  }

  /**
   * strStr_first
   * time complexity: O(n)
   * space complexity: O(1).
   *
   *
   * @param haystack
   * @param needle
   * @return int
   */
  public int strStr_first(String haystack, String needle) {
    if (needle.isEmpty()) {
      return 0;
    }

    int haystackLength = haystack.length();
    int needleLength = needle.length();
    int max = haystackLength - needleLength;

    for (int i = 0; i <= max; i++) {
      if (haystack.substring(i, i + needleLength).equals(needle)) {
        return i;
      }
    }

    return -1;
  }
}
