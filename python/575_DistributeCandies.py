class Solution:
    def distributeCandies(self, candies: 'List[int]') -> 'int':
        candy = set(candies)
        pairNum = len(candies) // 2
        return min(len(candy),pairNum)

def main():
    print(Solution().distributeCandies([1, 1, 2, 2, 3, 3]))
    # Output: 3
    # Explanation:
        # There are three different kinds of candies (1, 2 and 3), and two candies for each kind.
        # Optimal distribution: The sister has candies [1,2,3] and the brother has candies [1,2,3], too. 
        # The sister has three different kinds of candies. 

    print(Solution().distributeCandies([1, 1, 2, 3]))
    # Output: 2
        # Explanation: For example, the sister has candies[2, 3] and the brother has candies[1, 1].
        #     The sister has two different kinds of candies, the brother has only one kind of candies.
if __name__ == '__main__':
    main()
