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
    return this.fourSum_leetcode_solution(nums, target);
  }

  private List<List<Integer>> fourSum_leetcode_solution(int[] nums, int target) {
    Arrays.sort(nums);
    List<List<Integer>> lists = new ArrayList<>();

    for (int i = 0; i < nums.length - 3; i++) {
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }
      for (int j = i + 1; j < nums.length - 2; j++) {
        if (j > i + 1 && nums[j] == nums[j - 1]) {
          continue;
        }
        int left = j + 1;
        int right = nums.length - 1;
        while (left < right) {
          long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
          if (sum == target) {
            lists.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
            left++;
            right--;
            while (left < right && nums[left] == nums[left - 1]) {
              left++;
            }
            while (left < right && nums[right] == nums[right + 1]) {
              right--;
            }
          } else if (sum < target) {
            left++;
          } else {
            right--;
          }
        }
      }
    }
    return lists;
  }

  private List<List<Integer>> fourSum_fail(int[] nums, int target) {
    Arrays.sort(nums);
    List<List<Integer>> lists = new ArrayList<>();

    for (int i = 0; i < nums.length - 3; i++) {
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }
      for (int j = i + 1; j < nums.length - 2; j++) {
        if (j > i + 1 && nums[j] == nums[j - 1]) {
          continue;
        }
        int left = j + 1;
        int right = nums.length - 1;
        while (left < right) {
          long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
          if (sum == target) {
            lists.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
            left++;
            right--;
            while (left < right && nums[left] == nums[left - 1]) {
              left++;
            }
            while (left < right && nums[right] == nums[right + 1]) {
              right--;
            }
          } else if (sum < target) {
            left++;
          } else {
            right--;
          }
        }
      }
    }
    return lists;
  }


}
