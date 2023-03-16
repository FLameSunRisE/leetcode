package main.array;

import java.util.HashMap;
import java.util.Map;

/**
 * ContainsDuplicateII219.
 *
 * @author jay
 * @version 1.0.0
 * @date 2023/03/15
 */
public class ContainsDuplicateII219 {

  public boolean containsNearbyDuplicate(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
        return true;
      } else {
        map.put(nums[i], i);
      }
    }
    return false;
  }
}
