package main.array;

import java.util.Arrays;
import java.util.HashMap;

/**
 * ContainsDuplicate217.
 *
 * @author jay
 * @version 1.0.0
 * @date 2023/03/15
 */
public class ContainsDuplicate217 {

  public boolean containsDuplicate_hash(int[] nums) {
    HashMap<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
    for (int i : nums) {
      if (resultMap.containsKey(i)) {
        return true;
      }
      resultMap.put(i, 1);
    }
    return false;
  }

  public boolean containsDuplicate(int[] nums) {
    Arrays.sort(nums);
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == nums[i - 1]) {
        return true;
      }
    }
    return false;
  }
}
