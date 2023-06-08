# [215. Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/description/)

- [215. Kth Largest Element in an Array](#215-kth-largest-element-in-an-array)
  - [Solution](#solution)
    - [解法一: 排序法](#解法一-排序法)
    - [解法二: Heap](#解法二-heap)
    - [解法三: Quickselect 算法(TODO 待理解)](#解法三-quickselect-算法todo-待理解)

---

Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

You must solve it in O(n) time complexity.

**Example:**

```txt
Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
```

**Example:**

```txt
Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
```

**Constraints:**

```txt
1 <= k <= nums.length <= 105
-104 <= nums[i] <= 104
```

## Solution

### 解法一: 排序法

- 思路
  - 因需要壓在$O(n)$,所以首先使用排序法
  - 排序後直接返回從後面數過來第 k 個即可(nums.length-1)
- 效率
  - 時間複雜度：$O(n \log n)$
    - 僅使用排序時間複雜度
  - 空間複雜度：$O(n)$a
- code

  ```java
  class Solution {
    private int findKthLargest(int[] nums, int k) {
      // 處理第一筆最大值
      if (k == 1) {
        return Arrays.stream(nums).max().getAsInt();
      }
      Arrays.sort(nums);
      return nums[nums.length - k];
    }
  }
  ```

### 解法二: Heap

- 思路
  - 使用最大堆（Max Heap）
    1. 將所有的元素加入最大堆中
    2. k-1 個最大元素（即進行 k-1 次 poll() 操作）。
    3. 返回最大堆中的根節點，即為第 k 大的元素。
- 效率
  - 時間複雜度：$O(n + k \log n)$。
    空間複雜度：$O(n)$
- code

  ```java
  class Solution {
    private int findKthLargest(int[] nums, int k) {
      PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
      for (int num : nums) {
        maxHeap.offer(num);
      }
      for (int i = 0; i < k - 1; i++) {
        maxHeap.poll();
      }
      return maxHeap.peek();
    }
  ```

### 解法三: Quickselect 算法(TODO 待理解)

- 思路
  - 使用 Quickselect 算法，將陣列進行分區（Partition）操作
    - 通過將陣列進行分區操作，將比 pivot 大的元素放在左邊，比 pivot 小的元素放在右邊，來定位第 k 大的元素
- 步驟

  1. 選擇一個 pivot。
  2. 將數據分區成兩部分，小於 pivot 的數字放在左邊，大於 pivot 的數字放在右邊。這與快速排序相同。
  3. 不同於快速排序，Quickselect 只對一個分區進行遞迴，即包含目標第 k 大元素的那一個分區。
  4. 主要注意點是，每次分區後，pivot 都會在正確的位置上。因此，我們只需檢查：

  - 若 pivot 在目標 "第 k 大元素" 的索引上，則返回該索引的數字。
  - 若 pivot 在目標索引之前，則在右分區上進行 Quickselect。
  - 若 pivot 在目標索引之後，則在左分區上進行 Quickselect。

  5. 只對一個分區進行 Quickselect，將平均時間複雜度從 O(nlogn) 降低為 O(n)。

- 效率
  - 時間複雜度：$O(n)$ ~ $O(n^2)$
    - avg.：O(n)，其中 n 為陣列的長度。在平均情況下，Quickselect 的運行時間與快速排序相似，
    - max. : O(n^2)，最壞情況下，每次選擇的 pivot 都是陣列中的最大或最小元素
  - 空間複雜度：$O(n)$
- code

  ```java
  class Solution {
    private int findKthLargest(int[] nums, int k) {
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
      return -1; // 若無解則返回 -1，可以根據需求進行修改
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
  ```
