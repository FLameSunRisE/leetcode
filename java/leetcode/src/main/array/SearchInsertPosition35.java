package main.array;

public class SearchInsertPosition35 {

  public int searchInsert(int[] nums, int target) {
    return this.searchInsert_insert_sorted(nums, target);
//    return this.searchInsert_first(nums, target);
  }

  /**
   * searchInsert_first-two point.
   * time complexity: O(log n)
   * space complexity: O(1).
   *
   * @param nums
   * @param target
   * @return int
   */
  private int searchInsert_first(int[] nums, int target) {
    int start = 0;
    int mid = nums.length / 2;
    int end = nums.length - 1;
    while(nums[mid] != target) {
      if (nums[mid] > target) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
      mid = (start + end) / 2;
      if (start > end) {
        return start;
      }
    }
    return mid;
  }

  /**
   * searchInsert_first-two point.
   * time complexity: O(log n)
   * space complexity: O(1).
   *
   * @param nums
   * @param target
   * @return int
   */
  private int searchInsert_insert_sorted(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    while (right <= left){
      int mid = (right - left) / 2 + left;
      if (nums[mid] == target){
        return mid;
      }else if(nums[mid] > target){
        left = mid + 1;
      }else if(nums[mid] < target){
        right = mid - 1;
      }
    }
    return left;
  }
}
