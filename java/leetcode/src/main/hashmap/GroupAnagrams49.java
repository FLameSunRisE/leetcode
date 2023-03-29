package main.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * GroupAnagrams49.
 *
 * @author jay
 * @version 1.0.0
 * @date 2023/03/29
 */
public class GroupAnagrams49 {

  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();
    for (String str : strs) {
      char[] chars = str.toCharArray();
      Arrays.sort(chars);
      String key = new String(chars);
      if (map.containsKey(key)) {
        map.get(key).add(str);
      } else {
        List<String> list = new ArrayList<>();
        list.add(str);
        map.put(key, list);
      }
    }
    return new ArrayList<>(map.values());
  }

}
