from typing import List


class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        for index in range(len(digits)-1, -1, -1):
            print('idnex:'+str(index))
            digits[index] += 1
            if digits[index] != 10:
                return digits
            digits[index] = 0
        return [1] + digits
        return


def main():
    # Example:1
    digits = [1, 2, 3]
    print(Solution().plusOne(digits))
    # Input: digits = [1,2,3]
    # Output: [1,2,4]
    # Explanation: The array represents the integer 123.
    # Incrementing by one gives 123 + 1 = 124.
    # Thus, the result should be [1,2,4].
    print('------------------------------')
    # Example:2
    digits = [4, 3, 2, 1]
    print(Solution().plusOne(digits))
    # Input: digits = [4,3,2,1]
    # Output: [4,3,2,2]
    # Explanation: The array represents the integer 4321.
    # Incrementing by one gives 4321 + 1 = 4322.
    # Thus, the result should be [4,3,2,2].
    print('------------------------------')
    # Example:ˇ
    digits = [9]
    print(Solution().plusOne(digits))
    # Input: digits = [9]
    # Output: [1,0]
    # Explanation: The array represents the integer 9.
    # Incrementing by one gives 9 + 1 = 10.
    # Thus, the result should be [1,0].


if __name__ == '__main__':
    main()
