class Solution:
    def sum_adjacent(self, grid, i, j):
        adjacent = (i + 1, j), (i - 1, j), (i, j + 1), (i, j - 1),
        res = 0
        for x, y in adjacent:
            if x < 0 or y < 0 or x == len(grid) or y == len(grid[0]) or grid[x][y] == 0:
                res += 1
        return res

    def islandPerimeter(self, grid: 'List[List[int]]') -> 'int':
        count = 0
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j] == 1:
                    count += self.sum_adjacent(grid, i, j)
        return count


def main():
    input = [[0, 1, 0, 0], [1, 1, 1, 0], [0, 1, 0, 0], [1, 1, 0, 0]]
    # Output: 16er(input))
    # Explanation: The perimeter is the 16 yellow stripes in the image below:
    print(Solution().islandPerimeter(input))


if __name__ == '__main__':
    main()
