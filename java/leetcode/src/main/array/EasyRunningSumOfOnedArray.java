package leetcode.src.array;

import java.util.Arrays;

/**
 * Created by jayyeh on 2022/07/29
 *
 * <p>
 * 1480. Running Sum of 1d Array
 * <p>
 *
 */
public class EasyRunningSumOfOnedArray {
    /**
     * Main method
     * 
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] rslt = new EasyRunningSumOfOnedArray().runningSum(nums);
        System.out.println(Arrays.toString(rslt));
        int[] nums1 = { 1, 1, 1, 1, 1 };
        rslt = new EasyRunningSumOfOnedArray().runningSum(nums1);
        System.out.println(Arrays.toString(rslt));
        int[] nums2 = { 3, 1, 2, 10, 1 };
        rslt = new EasyRunningSumOfOnedArray().runningSum(nums2);
        System.out.println(Arrays.toString(rslt));
    }

    /**
     * 
     *
     * @param nums
     * @return
     */
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
