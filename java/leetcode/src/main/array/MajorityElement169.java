package main.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * MajorityElement169.
 *
 * @author jay
 * @version 1.0.0
 * @date 2023/03/21
 */
public class MajorityElement169 {

  public int majorityElement_1(int[] nums) {
    HashMap<Integer, Integer> tmp = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (tmp.containsKey(nums[i])) {
        tmp.put(nums[i], tmp.get(nums[i]) + 1);
      } else {
        tmp.put(nums[i], 1);
      }
    }
    int maxKey = -1;
    int count = 0;
    for (Map.Entry<Integer, Integer> entry : tmp.entrySet()) {
      if (entry.getValue() > count) {
        maxKey = entry.getKey();
        count = entry.getValue();
      }
    }
    return maxKey;
  }

  public int majorityElement_2(int[] nums) {
    HashMap<Integer,Integer> map = new HashMap<>();
    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    for (int key : map.keySet()) {
      if (map.get(key) > nums.length/2) {
        return key;
      }
    }
    return -1;
  }

  public int majorityElement_sort(int[] nums) {
    Arrays.sort(nums);
    return nums[nums.length / 2];
  }

  /**
   * majorityElement-摩爾投票法.
   *
   * @param nums
   * @return int
   */
  public int majorityElement(int[] nums) {
    int count = 0;
    Integer candidate = null;

    for (int num : nums) {
      if (count == 0) {
        candidate = num;
      }
      count += (num == candidate) ? 1 : -1;
    }

    return candidate;
  }
}
