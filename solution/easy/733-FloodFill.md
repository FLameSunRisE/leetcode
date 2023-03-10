# 733. Flood Fill

An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.

You are also given three integers sr, sc, and color. You should perform a flood fill on the image starting from the pixel image[sr][sc].

To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color), and so on. Replace the color of all of the aforementioned pixels with color.

Return the modified image after performing the flood fill.

<!-- **Note:**  -->

**Example 1:**

```txt
Input: image = [[1,1,1],[1,1,0],[1,0,1]], sr = 1, sc = 1, color = 2
Output: [[2,2,2],[2,2,0],[2,0,1]]
Explanation: From the center of the image with position (sr, sc) = (1, 1) (i.e., the red pixel), all pixels connected by a path of the same color as the starting pixel (i.e., the blue pixels) are colored with the new color.
Note the bottom corner is not colored 2, because it is not 4-directionally connected to the starting pixel.
```

**Example 2:**

```txt
Input: image = [[0,0,0],[0,0,0]], sr = 0, sc = 0, color = 0
Output: [[0,0,0],[0,0,0]]
Explanation: The starting pixel is already colored 0, so no changes are made to the image.
```

**Constraints:**

```txt
m == image.length
n == image[i].length
1 <= m, n <= 50
0 <= image[i][j], color < 216
0 <= sr < m
0 <= sc < n
```

## Solution

- 使用dfs遍歷
  - 若其顏色等於起始顏色 : 改為新色

> ChatGPT
>
> 遞歸 DFS 來遍歷連通分量。在每個像素中，如果其顏色等於起始像素的顏色，則將其設置為新的顏色，並遞歸地將其上下左右相鄰的像素設置為新的顏色。
>
> DFS
>
> - 遍歷起始像素上下左右相鄰的像素，並對它們進行遞歸調用
> - 遍歷相鄰像素時，需要判斷這些像素是否越界以及是否已經被訪問過
> - 如果這些像素的顏色等於起始像素的顏色，則將它們的顏色設置為新的顏色

## 時間複雜度：O(N)

## 空間複雜度：O(N)

## code

- java

  - Code

    ```java
    class Solution {
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
    ```
