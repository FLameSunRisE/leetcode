package main.array;

import java.util.List;

/**
 * LongestWordInDictionaryThroughDeleting524.
 *
 * @author jayyeh
 * @version 1.0.0
 * @date 2023/06/08
 */
public class LongestWordInDictionaryThroughDeleting524 {

  public String findLongestWord(String s, List<String> dictionary) {
    return this.findLongestWord_first(s, dictionary);
  }

  private String findLongestWord_first(String s, List<String> dictionary) {
    String ans = "";
    for (String word : dictionary) {
      if (shouldSkipWord(word, ans)) {
        continue;
      }
      if (isSubsequence(s, word)) {
        ans = word;
      }
    }
    return ans;
  }

  /**
   * isSubsequence-判斷是否為s的子序列.
   *
   * @param s
   * @param word
   * @return boolean
   */
  private boolean isSubsequence(String s, String word) {
    int pos = -1;
    for (int i = 0; i < word.length(); i++) {
      pos = s.indexOf(word.charAt(i), pos + 1);
      if (pos == -1) {
        break;
      }
    }
    return pos != -1;
  }

  /**
   * shouldSkipWord-判斷是否需要跳過.
   *
   * @param word
   * @param ans
   * @return boolean
   */
  private boolean shouldSkipWord(String word, String ans) {
    int wordSize = word.length();
    int ansSize = ans.length();
    // 當前單詞的長度小於最長單詞的長度 || 長度相等但字典序小於最長單詞
    if (wordSize < ansSize || (wordSize == ansSize && word.compareTo(ans) > 0)) {
      return true;
    }
    return false;
  }
}
