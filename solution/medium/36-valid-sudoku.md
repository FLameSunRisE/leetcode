# [36. Valid Sudoku](https://leetcode.com/problems/valid-sudoku/)

- [36. Valid Sudoku](#36-valid-sudoku)
  - [題目](#題目)
  - [範例](#範例)
  - [Solution](#solution)
    - [解法一](#解法一)
    - [解法二](#解法二)

---

## 題目

Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.

## 範例

**Example:**

```txt
Input: board =
[["5","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
Output: true
```

**Example:**

```txt
Input: board =
[["8","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
Output: false
Explanation: Same as Example 1, except with the 5 in the top left corner being modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.
```

**Constraints:**

```txt
board.length == 9
board[i].length == 9
board[i][j] is a digit 1-9 or '.'.
```

## Solution

### 解法一

- 思路
  - 滿足條件
    - 每一行都沒有重複的數字：對於每一行，檢查該行中的每個數字是否只出現一次。
    - 每一列都沒有重複的數字：對於每一列，檢查該列中的每個數字是否只出現一次。
    - 每個九宮格都沒有重複的數字：對於每個九宮格（3x3 的子方塊），檢查該九宮格中的每個數字是否只出現一次。
  - 步驟
    - 創建三個二維布爾數組 rowSeen、colSeen 和 boxSeen
    - 檢查該數字是否已經在 rowSeen[i]、colSeen[j] 或 boxSeen[boxIndex] 中出現過
- 效率
  - 時間複雜度：$O(1)$
    - 因棋盤 9\*9
  - 空間複雜度：$O(n)$
- code

  ```java
  class Solution {
    private boolean isValidSudoku_first(char[][] board) {
        // 建立紀錄資訊
        boolean[][] rowSeen = new boolean[9][9];
        boolean[][] colSeen = new boolean[9][9];
        boolean[][] boxSeen = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
          for (int j = 0; j < 9; j++) {
            char num = board[i][j];
            if (num == '.') {
              continue;
            }

            // 轉換成索引
            int digit = num - '1';

            // 檢查行中是否已經出現該數字
            if (rowSeen[i][digit]) {
              return false;
            }
            rowSeen[i][digit] = true;

            // 檢查列中是否已經出現該數字
            if (colSeen[j][digit]) {
              return false;
            }
            colSeen[j][digit] = true;

            // 檢查九宮格中是否已經出現該數字
            int boxIndex = (i / 3) * 3 + j / 3;
            if (boxSeen[boxIndex][digit]) {
              return false;
            }
            boxSeen[boxIndex][digit] = true;
          }
        }
        return true;
      }
  }
  ```

### 解法二

- 思路
- 效率
  - 時間複雜度：$O(n)$
    空間複雜度：$O(n)$
- code

  ```java
  class Solution {

  }
  ```
