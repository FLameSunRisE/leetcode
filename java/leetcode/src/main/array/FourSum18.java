package main.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * FourSum18.
 *
 * @author jayyeh
 * @version 1.0.0
 * @date 2023/05/31
 */
public class FourSum18 {

  public List<List<Integer>> fourSum(int[] nums, int target) {
    return this.fourSum_first(nums, target);
  }

  private List<List<Integer>> fourSum_first(int[] nums, int target) {
    Arrays.sort(nums);
    List<List<Integer>> lists = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
      // 跳過計算過的數字
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }

      int left = 0;
      int right = nums.length - 1;

      int twoSum = nums[left] + nums[right];

      while (left < right) {
        int nextLeft = left + 1;
        int nextRight = right - 1;
        int sum = twoSum + nums[nextLeft] + nums[nextRight];
        if (sum == target){
          lists.add(Arrays.asList(nums[left],
              nums[right],
              nums[nextLeft],
              nums[nextLeft]));
        }
      }

    }

    return null;
  }

}
