package main.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * KthLargestElementInAnArray215.
 *
 * @author jayyeh
 * @version 1.0.0
 * @date 2023/06/08
 */
public class KthLargestElementInAnArray215 {

  public int findKthLargest(int[] nums, int k) {
//    this.findKthLargest_max_heap(nums, k);
//    this.findKthLargest_quick_select(nums, k);
    return this.findKthLargest_first(nums, k);
  }

  private int findKthLargest_first(int[] nums, int k) {
    // 處理第一筆最大值
    if (k == 1) {
      return Arrays.stream(nums).max().getAsInt();
    }
    Arrays.sort(nums);
    return nums[nums.length - k];
  }

  private int findKthLargest_max_heap(int[] nums, int k) {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    for (int num : nums) {
      maxHeap.offer(num);
    }
    for (int i = 0; i < k - 1; i++) {
      maxHeap.poll();
    }
    return maxHeap.peek();
  }

  private int findKthLargest_quick_select(int[] nums, int k) {
    int left = 0;
    int right = nums.length - 1;
    while (left <= right) {
      int pivotIndex = partition(nums, left, right);
      if (pivotIndex == k - 1) {
        return nums[pivotIndex];
      } else if (pivotIndex > k - 1) {
        right = pivotIndex - 1;
      } else {
        left = pivotIndex + 1;
      }
    }
    return -1;
  }

  private int partition(int[] nums, int left, int right) {
    int pivot = nums[left];
    int i = left + 1;
    int j = right;
    while (i <= j) {
      if (nums[i] < pivot && nums[j] > pivot) {
        swap(nums, i, j);
        i++;
        j--;
      }
      if (nums[i] >= pivot) {
        i++;
      }
      if (nums[j] <= pivot) {
        j--;
      }
    }
    swap(nums, left, j);
    return j;
  }

  private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}
