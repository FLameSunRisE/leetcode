package main.array;

public class RemoveElement27 {

  /**
   * removeElement.
   *
   * @param nums
   * @param val
   * @return int
   */
  public int removeElement(int[] nums, int val) {
    int start = 0;
    int end = nums.length - 1;

    while (start <= end) {
      if (nums[start] == val) {
        nums[start] = nums[end];
        end--;
      } else {
        start++;
      }
    }

    return start;
  }
}
