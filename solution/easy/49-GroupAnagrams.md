# 49. Group Anagrams

Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

**Example 1:**

```txt
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
```

**Example 2:**

```txt
Input: strs = [""]
Output: [[""]]
```

**Example 3:**

```txt
Input: strs = ["a"]
Output: [["a"]]
```

**Clarification:**

```txt
1 <= strs.length <= 104
0 <= strs[i].length <= 100
strs[i] consists of lowercase English letters.
```

## Solution

### 解法一(ChatGpt)

- 說明

  -

- 時間複雜度：$O(nk \log k)$
  - 其中 $n$ 是字符串數組的長度，$k$ 是字符串的最大長度。需要遍歷每個字符串，對每個字符串進行排序，對每個字符串進行排序，時間複雜度為 $k \log k$，因此總時間複雜度為 $O(nk \log k)$。
- 空間複雜度：$O(nk)$

  - 需要用哈希表存儲分組后的字符串，最壞情況下需要存儲所有的字符串。

  ```java
  class Solution {
      public List<List<String>> groupAnagrams(String[] strs) {
          Map<String, List<String>> map = new HashMap<>();
          for (String str : strs) {
              char[] chars = str.toCharArray();
              Arrays.sort(chars);
              String key = new String(chars);
              if (map.containsKey(key)) {
                  map.get(key).add(str);
              } else {
                  List<String> list = new ArrayList<>();
                  list.add(str);
                  map.put(key, list);
              }
          }
          return new ArrayList<>(map.values());
      }
  }
  ```
