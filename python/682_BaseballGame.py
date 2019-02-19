class Solution:
    def calPoints(self, ops: 'List[str]') -> 'int':
        sumList = []
        for op in ops:
            if op is 'C':
                sumList = sumList[:-1]
            elif op is 'D':
                sumList.append(sumList[-1]*2)
            elif op is '+':
                sumList.append(sumList[-1]+sumList[-2])
            else:
                sumList.append(int(op))
        return sum(sumList)

def main():
    input = ["5", "2", "C", "D", "+"]
    # Output: Output: 30
    print(Solution().calPoints(input))
    # Explanation: 
        # Round 1: You could get 5 points. The sum is: 5.
        # Round 2: You could get 2 points. The sum is: 7.
        # Operation 1: The round 2's data was invalid. The sum is: 5.  
        # Round 3: You could get 10 points (the round 2's data has been removed). The sum is: 15.
        # Round 4: You could get 5 + 10 = 15 points. The sum is: 30.

    input = ["5", "-2", "4", "C", "D", "9", "+", "+"]
    # Output: 27
    # Explanation:
        # Round 1: You could get 5 points. The sum is: 5.
        # Round 2: You could get - 2 points. The sum is: 3.
        # Round 3: You could get 4 points. The sum is: 7.
        # Operation 1: The round 3's data is invalid. The sum is: 3.
        # Round 4: You could get - 4 points(the round 3's data has been removed). The sum is: -1.
        # Round 5: You could get 9 points. The sum is: 8.
        # Round 6: You could get - 4 + 9 = 5 points. The sum is 13.
        # Round 7: You could get 9 + 5 = 14 points. The sum is 27.
    print(Solution().calPoints(input))

if __name__ == '__main__':
    main()
