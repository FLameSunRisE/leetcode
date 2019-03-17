# 892. Surface Area of 3D Shapes

On a N * N grid, we place some 1 * 1 * 1 cubes.

Each value v = grid[i][j] represents a tower of v cubes placed on top of grid cell (i, j).

Return the total surface area of the resulting shapes.

1. 
**Example 1:**

```
Input: [[2]]
Output: 10
```

**Example 2:**

```
Input: [[1,2],[3,4]]
Output: 34
```
**Example 3:**

```
Input: [[1,0],[0,2]]
Output: 16
```
**Example 4:**

```
Input: [[1,1,1],[1,0,1],[1,1,1]]
Output: 32
```
**Example 2:**

```
Input: [[2,2,2],[2,1,2],[2,2,2]]
Output: 46
```

**Note:**

1 <= N <= 50
0 <= grid[i][j] <= 50



## Solution:

The title of this question is to ask for the overall area.
Step 1: calculate the total surface of the cube (4*n+2),

Step 2: Pick up the adjacent overlapping area, find the minimum value and multiply by 2 (the overlap of the two cubes)

## Code:

* python:

```py
class Solution:
    def surfaceArea(self, grid: List[List[int]]) -> int:
        area = 0
        n = len(grid)
        for i in range(n):
            for j in range(n):
                if grid[i][j]:
                    area += grid[i][j]*4 + 2
                if i > 0:
                    area -= min(grid[i][j], grid[i-1][j]) * 2
                if j > 0:
                    area -= min(grid[i][j], grid[i][j-1]) * 2
        return area
```



