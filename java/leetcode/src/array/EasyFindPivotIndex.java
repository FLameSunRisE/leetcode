package leetcode.src.array;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by jayyeh on 2022/07/29
 *
 * <p>
 * 1480. Running Sum of 1d Array
 * <p>
 *
 */
public class EasyFindPivotIndex {
    /**
     * Main method
     * 
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = { 1, 7, 3, 6, 5, 6 };
        int rslt = new EasyFindPivotIndex().pivotIndex(nums);
        System.out.println(rslt);
        int[] nums1 = { 1, 2, 3 };
        rslt = new EasyFindPivotIndex().pivotIndex(nums1);
        System.out.println(rslt);
        int[] nums2 = { 2, 1, -1 };
        rslt = new EasyFindPivotIndex().pivotIndex(nums2);
        System.out.println(rslt);
    }

    /**
     * 
     *
     * @param nums
     * @return
     */
    public int pivotIndex(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int sum = IntStream.of(nums).sum();
        int tempSum = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == sum - 2 * tempSum) {
                return j;
            }
            tempSum += nums[j];
        }
        return -1;
    }
}
