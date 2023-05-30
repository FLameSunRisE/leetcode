package main.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LetterCombinationsOfAPhoneNumber17.
 *
 * @author jayyeh
 * @version 1.0.0
 * @date 2023/05/30
 */
public class LetterCombinationsOfAPhoneNumber17 {

  List<String> result = new ArrayList<>();
  HashMap<Character, String> phoneMaps;
  private static final Map<Character, String[]> digitMap = new HashMap<>();


  public List<String> letterCombinations(String digits) {
    return this.letterCombinations_first(digits);
  }

  private List<String> letterCombinations_first(String digits) {
    // 排除空值
    if (digits == null || digits.length() == 0) {
      return result;
    }
    // 建立map資料
    phoneMaps = givenPhoneMap();
    // 開始計算
    generateCombinations(digits, "", 0);
    return result;
  }

  private void generateCombinations(String digits, String letters, int idx) {
    if (digits.length() == letters.length()) {
      result.add(letters);
      return;
    }
    String currDigit = "";
    if (phoneMaps.containsKey(digits.charAt(idx))) {
      currDigit = phoneMaps.get(digits.charAt(idx));
    }
    for (int i = 0; i < currDigit.length(); ++i) {
      generateCombinations(digits, letters + currDigit.charAt(i), idx + 1);
    }
  }

  public List<String> letterCombinations_chatgpt(String digits) {
    List<String> combinations = new ArrayList<>();
    if (digits == null || digits.length() == 0) {
      return combinations;
    }
    generateCombinations_chatgpt("", digits, combinations);
    return combinations;
  }

  private void generateCombinations_chatgpt(String current, String remaining,
      List<String> combinations) {
    if (remaining.isEmpty()) {
      combinations.add(current);
      return;
    }
    char digit = remaining.charAt(0);
    String[] letters = digitMap.get(digit);
    for (String letter : letters) {
      generateCombinations_chatgpt(current + letter, remaining.substring(1), combinations);
    }
  }

  private HashMap<Character, String> givenPhoneMap() {
    HashMap<Character, String> phoneMap = new HashMap<>();
    phoneMap.put('2', "abc");
    phoneMap.put('3', "def");
    phoneMap.put('4', "ghi");
    phoneMap.put('5', "jkl");
    phoneMap.put('6', "mno");
    phoneMap.put('7', "pqrs");
    phoneMap.put('8', "tuv");
    phoneMap.put('9', "wxyz");
    return phoneMap;
  }

  static {
    digitMap.put('2', new String[]{"a", "b", "c"});
    digitMap.put('3', new String[]{"d", "e", "f"});
    digitMap.put('4', new String[]{"g", "h", "i"});
    digitMap.put('5', new String[]{"j", "k", "l"});
    digitMap.put('6', new String[]{"m", "n", "o"});
    digitMap.put('7', new String[]{"p", "q", "r", "s"});
    digitMap.put('8', new String[]{"t", "u", "v"});
    digitMap.put('9', new String[]{"w", "x", "y", "z"});
  }
}
