# 169. Majority Element

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

**Example 1:**

```txt
Input: nums = [3,2,3]
Output: 3
```

**Example 2:**

```txt
Input: nums = [2,2,1,1,1,2,2]
Output: 2
```

**Constraints:**

```txt
n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
```

## Solution

1. HashMap
    - 透過hashmap存每個key值的次數，for loop取出
    - 時間複雜度：O(n)，遍歷一次數組。
    - 空間複雜度：O(n)，hashmap需要額外的空間來存儲。
2. Sort
    - 從```the element that appears more than ⌊n / 2⌋ times```可以得知排序完後取中間值即為解答
    - 時間複雜度：O(nlogn) =>排序
    - 空間複雜度：O(1)
3. 摩爾投票法
    - 說明:
    假設候選人為第一個元素，票數為1。遍歷數組，如果下一個元素與候選人相同，則票數加1，否則票數減1。如果票數為0，則將候選人改為下一個元素。因為過半元素的出現次數超過其他元素，所以最後剩下的候選人必定是過半元素。

    - 時間複雜度：O(n)，遍歷一次數組。
    - 空間複雜度：O(1)，不需要額外的空間。

## code

- java

  - Code

    ```java
    class Solution {
        public int majorityElement(int[] nums) {
            HashMap<Integer,Integer> tmp = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
            if (tmp.containsKey(nums[i])){
                tmp.put(nums[i],tmp.get(nums[i])+1);
            }else {
                tmp.put(nums[i], 1);
            }
            }
            int maxKey = -1;
            int count = 0;
            for(Map.Entry<Integer, Integer> entry : tmp.entrySet()) {
            if (entry.getValue() > count){
                maxKey = entry.getKey();
                count = entry.getValue();
            }
            }
            return maxKey;
        }

        public int majorityElement(int[] nums) {
            Arrays.sort(nums);
            return nums[nums.length/2];
        }

        public int majorityElement(int[] nums) {
            int count = 0;
            Integer candidate = null;

            for (int num : nums) {
                if (count == 0) {
                    candidate = num;
                }
                count += (num == candidate) ? 1 : -1;
            }

            return candidate;
        }
    }
    ```
