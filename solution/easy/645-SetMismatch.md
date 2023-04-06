# 645. Set Mismatch

You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

**Example:**

```txt
Input: nums = [1,2,2,4]
Output: [2,3]
```

**Example:**

```txt
Input: nums = [1,1]
Output: [1,2]
```

**Example:**

```txt
Input: n = 1
Output: true
```

**Constraints:**

```txt
2 <= nums.length <= 104
1 <= nums[i] <= 104
```

## Solution

### 解法一:HashMap

- 思路
  - 使用HashMap紀錄每個數字出現次數
  - 再透過stream去取得出現0次跟2次的數字
- 效率
  - 時間複雜度：O(n)
    空間複雜度：O(n)
- code

```java
class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer, Integer> tmpMap = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            tmpMap.put(nums[i], tmpMap.getOrDefault(nums[i], 0) + 1);
        }
        res[0] = tmpMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 2)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
        int[] missingNums = IntStream.rangeClosed(1, nums.length + 1)
                .filter(i -> !tmpMap.containsKey(i))
                .toArray();
        res[1] = missingNums[0];
        return res;
    }
}
```

## 解法二:排序

- 思路
  - 先將陣列排序，再遍歷陣列查找重複和缺失的數字
    - duplicate:重複
    - missing:缺失

- 效率
  - 時間複雜度：O(NlogN)
    空間複雜度：O(1)

- code

```java

```java
public int[] findErrorNums_sort(int[] nums) {
    int[] result = new int[2];
    int n = nums.length;
    // 存储每個数字是否存在的array
    boolean[] exists = new boolean[n + 1];
    int duplicate = 0;
    int missing = 0;
    for (int i = 0; i < n; i++) {
        if (exists[nums[i]]) {
            duplicate = nums[i];
        }
        exists[nums[i]] = true;
    }
    for (int i = 1; i <= n; i++) {
        if (!exists[i]) {
            missing = i;
            break;
        }
    }
    result[0] = duplicate;
    result[1] = missing;
    return result;
}
```
