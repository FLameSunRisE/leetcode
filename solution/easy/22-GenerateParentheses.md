# 22. Generate Parentheses

Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

**Example:**

```txt
Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
```

**Example:**

```txt
Input: n = 1
Output: ["()"]
```

**Constraints:**

```txt
1 <= n <= 8
```

## Solution

### 解法一:recurse

- 思路
  - 規則
    - 左括號等於右括號
    - 當左括號的數量不大於 n 時，才可以添加左括號
    - 當右括號的數量小於左括號的數量時，才可以添加右括號。
- 效率
  - 時間複雜度：$O(4^n)$
    空間複雜度：$O(n)$
- code

````java
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        recurse(res, 0, 0, new StringBuilder(), n);
        return res;
    }

    public void recurse(List<String> res, int left, int right, StringBuilder sb, int n) {
        if (sb.length() == n * 2) {
            res.add(sb.toString());
            return;
        }

        if (left < n) {
            recurse(res, left + 1, right, sb.append("("), n);
            sb.setLength(sb.length() - 1);
        }

        if (right < left) {
            recurse(res, left, right + 1, sb.append(")"), n);
            sb.setLength(sb.length() - 1);
        }
    }

    ```java
    public List<String> generateParenthesis(int n) {
        System.out.println("===================================================");
        System.out.println("GenerateParentheses22.generateParenthesis");
        List<String> list = new ArrayList<String>();
        backtrack(list, "", 0, 0, n);
        return list;
    }

    public void backtrack(List<String> list, String str, int open, int close, int max) {
        System.out.println("[GenerateParentheses22.recurse]open: " + open + ", close: " + close + ", str: " + str.toString() + ", max: " + max);
        if (str.length() == max * 2) {
            list.add(str);
            System.out.println("[sb.length() == n * 2] res = " + str.toString());
            return;
        }
        if (open < max) {
            System.out.println("[open < max]before backtrack > str = " + str);
            backtrack(list, str + "(", open + 1, close, max);
            System.out.println("[open < max]after backtrack > str = " + str);
        }
        if (close < open) {
            System.out.println("[close < open]before backtrack > str = " + str);
            backtrack(list, str + ")", open, close + 1, max);
            System.out.println("[close < open]after backtrack > str = " + str);
        }
    }
````
