package main.string;

/**
 * LengthOfLastWord58.
 *
 * @author jayyeh
 * @version 1.0.0
 * @date 2023/05/16
 */
public class LengthOfLastWord58 {

  public int lengthOfLastWord(String s) {
    return this.lengthOfLastWord_first(s);
  }

  private int lengthOfLastWord_first(String s) {
    if (s.isEmpty() || s.equals(" ")){
      return 0;
    }
    String[] words = s.split(" ");
    String lastWord = words[words.length - 1];
    return lastWord.length();
  }
}
