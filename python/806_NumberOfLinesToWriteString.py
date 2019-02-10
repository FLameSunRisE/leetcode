class Solution:
    def char_position(self,letter):
            return ord(letter) - 97
    def numberOfLines(self, widths: 'List[int]', S: 'str') -> 'List[int]':
        index = 0
        depth = 1
        for i in range(len(S)):
            indexWidth = self.char_position(S[i])
            strLength = widths[indexWidth]
            tmp = index + strLength
            if tmp > 100:
                depth += 1
                index = 0
            index += strLength
        return [depth,index]       

if __name__ == '__main__':
    solution = Solution()
    widths = [10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10]
    S = "abcdefghijklmnopqrstuvwxyz"
    print(solution.numberOfLines(widths, S))
    # Output:  Output: [3, 60]

    widths = [4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10]
    S = "bbbcccdddaaa"
    print(solution.numberOfLines(widths, S))
    # Output:  Output: [3, 60]