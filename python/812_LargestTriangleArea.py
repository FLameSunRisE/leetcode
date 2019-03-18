from typing import List


class Solution:
    def largestTriangleArea(self, points: List[List[int]]) -> float:
        def triangleArea(x1, y1, x2, y2, x3, y3):
            return abs(0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)))

        size = len(points)
        ans = 0
        for i in range(size):
            for j in range(i + 1, size):
                for k in range(j + 1, size):
                    x1, y1 = points[i]
                    x2, y2 = points[j]
                    x3, y3 = points[k]
                    ans = max(ans, triangleArea(x1, y1, x2, y2, x3, y3))
        return ans


def main():
    print(Solution().largestTriangleArea(
        [[0, 0], [0, 1], [1, 0], [0, 2], [2, 0]]))
    # Output: 2
    # Explanation:
    # The five points are show in the figure below. The red triangle is the largest.


if __name__ == '__main__':
    main()
