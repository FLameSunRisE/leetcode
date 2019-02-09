class Solution:
    def reverseWords(self, s: 'str') -> 'str':
        splList = s.split(' ')
        for i in range(len(splList)):
            splList[i] = splList[i][::-1]
        print(splList)
        return ' '.join(splList)

if __name__ == '__main__':
    solution = Solution()
    print(solution.reverseWords("Let's take LeetCode contest"))
    # Output: "s'teL ekat edoCteeL tsetnoc"