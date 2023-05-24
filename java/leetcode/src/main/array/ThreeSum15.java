package main.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum15 {

  public List<List<Integer>> threeSum(int[] nums) {
    return this.threeSum_first(nums);

  }

  private List<List<Integer>> threeSum_first(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> lists = new ArrayList<>();

    for (int i = 0; i < nums.length - 2; i++) {
      // 跳過計算過的數字
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }
      int left = i + 1;
      int right = nums.length - 1;

      while (left < right) {
        int sum = nums[i] + nums[left] + nums[right];

        if (sum == 0) {
          lists.add(Arrays.asList(nums[i], nums[left], nums[right]));
          left++;
          right--;

          // 跳過重複的數字
          while (left < right && nums[left] == nums[left - 1]) {
            left++;
          }
          while (left < right && nums[right] == nums[right + 1]) {
            right--;
          }
        } else if (sum < 0) {
          left++;
        } else {
          right--;
        }
      }
    }
    return lists;
  }
}
