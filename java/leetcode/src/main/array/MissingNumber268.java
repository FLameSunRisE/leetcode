package main.array;

import java.util.Arrays;

/**
 * MissingNumber268.
 *
 * @author jayyeh
 * @version 1.0.0
 * @date 2023/03/25
 */
public class MissingNumber268 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return n;
    }

    /**
     * missingNumber_math數學解法.
     *
     * @param nums
     * @return int
     */
    public int missingNumber_math(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int n = nums.length;
        return (n * (n + 1) / 2) - sum;
    }
}
