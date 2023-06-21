package main.array;

/**
 * ValidSudoku36.
 *
 * @author jay
 * @version 1.0.0
 * @date 2023/06/14
 */
public class ValidSudoku36 {

  public boolean isValidSudoku(char[][] board) {
    return this.isValidSudoku_first(board);
  }

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

        int digit = num - '1'; // 轉換成索引，例如 '1' 變成 0，'2' 變成 1，以此類推

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
