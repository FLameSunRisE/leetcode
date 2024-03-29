package main.array;

import java.util.Arrays;

public class ThreeSumClosest16 {

  public int threeSumClosest(int[] nums, int target) {
    return this.threeSumClosest_first(nums, target);
  }

  private int threeSumClosest_first(int[] nums, int target) {
    Arrays.sort(nums);
    int n = nums.length;
    int closestSum = nums[0] + nums[1] + nums[2];

    for (int i = 0; i < n - 2; i++) {
      int left = i + 1;
      int right = n - 1;

      while (left < right) {
        int sum = nums[i] + nums[left] + nums[right];
        if (sum == target) {
          return sum;
        } else if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
          closestSum = sum;
        }

        if (sum < target) {
          left++;
        } else {
          right--;
        }
      }
    }
    return closestSum;
  }

}
