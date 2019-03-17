from typing import List


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


def main():
    print(Solution().surfaceArea([[2]]))
    # Output: 10
    print(Solution().surfaceArea([[1, 2], [3, 4]]))
    # Output: 34
    print(Solution().surfaceArea([[1, 0], [0, 2]]))
    # Output: 16
    print(Solution().surfaceArea([[1, 1, 1], [1, 0, 1], [1, 1, 1]]))
    # Output: 32
    print(Solution().surfaceArea([[2, 2, 2], [2, 1, 2], [2, 2, 2]]))
    # Output: 46


if __name__ == '__main__':
    main()
