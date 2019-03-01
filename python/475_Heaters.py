from typing import List


class Solution:
    def findRadius(self, houses: List[int], heaters: List[int]) -> int:
        houses.sort()
        heaters.sort()
        heaters = [float('-inf')]+heaters+[float('inf')]  # add 2 fake heaters
        ans, i = 0, 0
        for house in houses:
            while house > heaters[i+1]:  # search to put house between heaters
                i += 1
            dis = min(house - heaters[i], heaters[i+1] - house)
            ans = max(ans, dis)
        return ans


def main():
    print(Solution().findRadius([1, 5], [2]))
    print(Solution().findRadius([1, 2, 3], [2]))
    # Output: 1
    # Explanation: The only heater was placed in the position 2,
    # and if we use the radius 1 standard,
    # then all the houses can be warmed.
    print(Solution().findRadius([1, 2, 3, 4], [1, 4]))
    # Output: 1
    # Explanation: The two heater was placed in the position 1 and 4.
    # We need to use radius 1 standard, then all the houses can be warmed.


if __name__ == '__main__':
    main()
