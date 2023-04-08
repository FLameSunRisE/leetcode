package main.hashmap;

import java.util.HashMap;

/**
 * MaximumNumberOfBalloons1189.
 *
 * @author jay
 * @version 1.0.0
 * @date 2023/04/08
 */
public class MaximumNumberOfBalloons1189 {

  public int maxNumberOfBalloons(String text) {
    HashMap<Character, Integer> tmpMap = new HashMap<>();
    for (char c : text.toCharArray()) {
      tmpMap.put(c, tmpMap.getOrDefault(c, 0) + 1);
    }
    int min = Integer.MAX_VALUE;
    min = Math.min(min, tmpMap.getOrDefault('b', 0));
    min = Math.min(min, tmpMap.getOrDefault('a', 0));
    min = Math.min(min, tmpMap.getOrDefault('l', 0) / 2);
    min = Math.min(min, tmpMap.getOrDefault('o', 0) / 2);
    min = Math.min(min, tmpMap.getOrDefault('n', 0));
    return min;
  }

  public int maxNumberOfBalloons_chatgpt(String text) {
    int[] count = new int[26];
    for (char c : text.toCharArray()) {
      count[c - 'a']++;
    }
    int min = count[1]; // 'a'
    min = Math.min(min, count[0]); // 'b'
    min = Math.min(min, count[11] / 2); // 'l'
    min = Math.min(min, count[14] / 2); // 'o'
    min = Math.min(min, count[13]); // 'n'
    return min;
  }


}
