package main.array;

/**
 * FloodFill733.
 *
 * @author jayyeh
 * @version 1.0.0
 * @date 2023/03/09
 */
public class FloodFill733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image == null || image.length == 0 || image[sr][sc] == color) {
            return image;
        }
        dfs(image, sr, sc, image[sr][sc], color);
        return image;
    }

    private void dfs(int[][] image, int row, int col, int oldColor, int color) {
        // 檢查是否越界
        if (row < 0 || row >= image.length || col < 0 || col >= image[0].length) {
            return;
        }
        // 檢查是否已經訪問過
        if (image[row][col] != oldColor) {
            return;
        }
        // 設置新的顏色
        image[row][col] = color;
        // 遞歸處理上下左右相鄰的像素
        dfs(image, row - 1, col, oldColor, color);
        dfs(image, row + 1, col, oldColor, color);
        dfs(image, row, col - 1, oldColor, color);
        dfs(image, row, col + 1, oldColor, color);
    }
}
