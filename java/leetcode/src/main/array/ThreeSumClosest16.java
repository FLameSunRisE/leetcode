package main.array;

import java.util.Arrays;

public class ThreeSumClosest16 {

  public int threeSumClosest(int[] nums, int target) {
    return this.threeSumClosest_first(nums, target);
  }

  private int threeSumClosest_first(int[] nums, int target) {
    Arrays.sort(nums);
    int closeSum = nums[0] + nums[1] + nums[2];

    for (int i = 0; i < nums.length - 2; i++) {
      // 跳過計算過的數字
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }
      int left = i + 1;
      int right = nums.length - 1;

      while (left < right) {
        int sum = nums[i] + nums[left] + nums[right];
        if (sum == closeSum) {
          return sum;
        } else if (Math.abs(sum - target) < Math.abs(closeSum - target)) {
          closeSum = sum;
        }
        if (sum < target) {
          left++;
          while (left < right && nums[left] == nums[left - 1]) {
            left++;
          }
        } else {
          right--;
          while (left < right && nums[right] == nums[right + 1]) {
            right--;
          }
        }
      }

    }
    return closeSum;
  }

}
