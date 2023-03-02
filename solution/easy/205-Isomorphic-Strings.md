# [205. Isomorphic Strings](https://leetcode.com/problems/isomorphic-strings/description/?envType=study-plan&id=level-1)

## Question

Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

## Case

Example 1:

```txt
Input: s = "egg", t = "add"
Output: true
```

Example 2:

```txt
Input: s = "foo", t = "bar"
Output: false
```

Example 3:

```txt
Input: s = "paper", t = "title"
Output: true
```

## Solution:

這個解法使用了兩個 HashMap，分別存儲 s 到 t 的映射和 t 到 s 的映射。遍歷 s 和 t 的每個字符，判斷當前字符是否已經在映射中出現，如果出現則判斷其映射是否相同，如果不相同則說明不是同構字符串，直接返回 false，否則將當前字符和其對應的字符加入到映射中。

時間複雜度為 O(n)，因為需要遍歷兩個字符串的每個字符，而 HashMap 的查詢和插入操作時間複雜度為 O(1)，因此總時間複雜度為 O(n)

## Code

- [Java](../../java/leetcode/src/main/string/IsIsomorphicString205.java)

    ```java
        public boolean isIsomorphic(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }
            HashMap<String, String> sMap = new HashMap<String, String>();
            HashMap<String, String> tMap = new HashMap<String, String>();
            for (int i = 0; i < s.length(); i++) {
                String sWord = String.valueOf(s.charAt(i));
                String tWord = String.valueOf(t.charAt(i));
                if (sMap.containsKey(sWord) && !sMap.get(sWord).equals(tWord)
                        || tMap.containsKey(tWord) && !tMap.get(tWord).equals(sWord)) {
                    return false;
                }
                sMap.put(sWord, tWord);
                tMap.put(tWord, sWord);
            }
            return true;
        }
    ```

