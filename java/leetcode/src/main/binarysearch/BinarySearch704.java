package main.binarysearch;

/**
 * BinarySearch704.
 *
 * @author jay
 * @version 1.0.0
 * @date 2023/03/08
 */
public class BinarySearch704 {

  public int search(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    while (left <= right) {
      int mid = (left + right) / 2;
      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] > target) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return -1;
  }
}
