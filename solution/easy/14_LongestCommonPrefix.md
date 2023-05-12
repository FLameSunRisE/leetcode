14. Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

<!-- **Note:**  -->

**Example 1:**

```
Input: strs = ["flower","flow","flight"]
Output: "fl"
```

**Example 2:**

```
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
```

**Clarification:**

```
1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lower-case English letters.
```

## Solution:

1. 基本檢核, None && length =0
2. 透過紀錄 prefix 資訊 從頭到尾比一次

- loop 檢查時
  - 相同 : 檢查下一個
  - 不同 : 移除 prefix 尾端再重新檢查

### 解法 1 - first

- 思路

  1. 排除基本異常條件:單數判斷
  2. 使用 stack 存放
     1. 如果是開頭符號則丟進去
     2. 反之,則判斷是否一組
        - 同組: pop 一層
        - 不同: return false

- 時間複雜度
  - 時間複雜度：O(n)
  - 空間複雜度：O(n)
- 程式

  ```java
  public boolean isValid(String s) {
      if (s.length() % 2 != 0) {
      return false;
      }
      Stack<Character> stack = new Stack();
      for (char c : s.toCharArray()) {
      if (c == '(' || c == '[' || c == '{') {
          stack.push(c);
      }else{
          Character top = stack.pop();
          if (c == ')' && top != '('){
          return false;
          }
          if (c == ']' && top != '['){
          return false;
          }
          if (c == '}' && top != '{'){
          return false;
          }
      }
      }
      return stack.isEmpty();
  }
  ```

### 解法 1 - first

- 思路

  1. 排除基本異常條件:單數判斷
  2. 使用 stack 存放
     1. 如果是開頭符號則丟進去
     2. 反之,則判斷是否一組
        - 同組: pop 一層
        - 不同: return false

- 時間複雜度
  - 時間複雜度：O(n)
  - 空間複雜度：O(n)
- 程式

  ```java
  public boolean isValid(String s) {
      if (s.length() % 2 != 0) {
      return false;
      }
      Stack<Character> stack = new Stack();
      for (char c : s.toCharArray()) {
      if (c == '(' || c == '[' || c == '{') {
          stack.push(c);
      }else{
          Character top = stack.pop();
          if (c == ')' && top != '('){
          return false;
          }
          if (c == ']' && top != '['){
          return false;
          }
          if (c == '}' && top != '{'){
          return false;
          }
      }
      }
      return stack.isEmpty();
  }
  ```

### 解法 2 - two-point(延伸上題)

- 思路

  1. 排除基本異常條件:單數判斷
  2. 遍歷字符串數組 strs，找到最短字符串的長度 ( O(N \* M))
  3. 在二分搜索過程中，進行 O(log(M)) 次迭代，每次迭代都需要通過 isCommonPrefix 方法檢查公共前綴的長度。而檢查公共前綴的過程，需要遍歷字符串數組 strs 中的每個字符串，判斷其是否以指定長度的前綴開頭，需要 O(N \* M) 的時間複雜度。

- 時間複雜度
  - 時間複雜度：O(N _ M _ log(M))
    - 其中 N 是字符串数组 strs 的长度，M 是最短字符串的长度。
  - 空間複雜度：O(1)

```java
    public String longestCommonPrefix_two_point(String[] strs) {
        if (strs.length == 0) {
        return "";
        }

        int minLen = Integer.MAX_VALUE;
        for (String str : strs) {
        minLen = Math.min(minLen, str.length());
        }

        int left = 0;
        int right = minLen;
        while (left < minLen) {
        int mid = (left + minLen) / 2;
        // 比較是否依樣
        if (isSameString(strs, mid)) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
        }
        return strs[0].substring(0, (left + right) / 2);
    }

    private boolean isSameString(String[] strs, int mid) {
        String prefix = strs[0].substring(0, mid);
        for (int i = 1; i < strs.length; i++) {
        if (!strs[i].startsWith(prefix)) {
            return false;
        }
        }
        return true;
    }
```

### 解法 3 - ??

- 思路

  1. 排除基本異常條件:單數判斷
  2. 遍歷剩餘的字符串，依次與當前的 prefix 進行比較 (O(N \* M^2)，其中 N 是字符串數組的長度，M 是最長公共前綴的長度)

  - 每次比較中，通過 startsWith 方法判斷字符串是否以當前的 prefix 開頭
  - 如果不是，則通過 substring 方法將 prefix 的最後一個字符去除
  - 如果 prefix 變為空字符串，則說明不存在公共前綴，直接返回空字符串

- 時間複雜度
  - 時間複雜度：O(N \* M^2)
    - N 是字符串數組 strs 的長度，M 是最長公共前綴的長度。
  - 空間複雜度：O(1)

```java
  public String longestCommonPrefix_opt(String[] strs) {
    if (strs == null || strs.length == 0) {
      return "";
    }

    String prefix = strs[0];
    for (int i = 1; i < strs.length; i++) {
      while (!strs[i].startsWith(prefix)) {
        prefix = prefix.substring(0, prefix.length() - 1);
        if (prefix.isEmpty()) {
          return "";
        }
      }
    }
    return prefix;
  }
```

### python

```py
class Solution:
  # 解法一
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if(strs is None or len(strs) == 0):
            return ""
        pre = strs[0]
        target = 1
        while (target < len(strs)):
            while strs[target].find(pre) != 0:
                tmp = len(pre) - 1
                pre = pre[:tmp]
            target += 1
        return pre
    # 解法二

    def longestCommonPrefix2(self, strs: List[str]) -> str:
        if(strs is None or len(strs) == 0):
            return ""
        prefix = strs[0]
        for i in range(1, len(strs)):
            while(strs[i].find(prefix) != 0):
                prefix = prefix[:-1]
                if len(prefix) == 0:
                    return ""
        return prefix

    # 大神寫法
    def longestCommonPrefix3(self, m):
        if not m:
            return ''
            # since list of string will be sorted and retrieved min max by alphebetic order
        s1 = min(m)
        s2 = max(m)
        print('s1:' + str(s1))
        print('s2:' + str(s2))

        for i, c in enumerate(s1):
            print('i:' + str(i), 'c:' + str(c))
            if c != s2[i]:
                print('if ans:' + str(s1))
                return s1[:i]  # stop until hit the split index
        print('ans:' + str(s1))
        return s1

```
