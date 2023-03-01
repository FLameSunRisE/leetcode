package leetcode.src.main.array;


import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by jayyeh on 2022/07/29
 *
 * <p>
 * 1480. Running Sum of 1d Array
 * <p>
 *
 * @author jayyeh
 */
public class EasyFindPivotIndex724 {
    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int rslt = new EasyFindPivotIndex724().pivotIndex(nums);
        System.out.println(rslt);
        int[] nums1 = {1, 2, 3};
        rslt = new EasyFindPivotIndex724().pivotIndex(nums1);
        System.out.println(rslt);
        int[] nums2 = {2, 1, -1};
        rslt = new EasyFindPivotIndex724().pivotIndex(nums2);
        System.out.println(rslt);
    }

    /**
     * pivotIndex.
     *
     * @param nums nums
     * @return int
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

    /**
     * pivotIndex2.
     *
     * @param nums nums
     * @return int
     */
    public int pivotIndex2(int[] nums) {
        int totalSum = IntStream.of(nums).sum();
        int leftSum = 0, rightSum = totalSum;
        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
