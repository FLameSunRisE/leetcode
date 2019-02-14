class Solution:
    def findComplement(self, num: 'int') -> 'int':
        bit = bin(num)[2:]
        bitList = list(bit)
        for s in range(0,len(bitList)):
            if bitList[s] == "1":
                bitList[s] = "0"
            else:
                bitList[s] = "1"
        ansInt = ''.join(bitList)
        return int(ansInt, 2)

if __name__ == '__main__':
    solution = Solution()
    input = 5
    print(solution.findComplement(input))
    # output : 2
    input = 1
    print(solution.findComplement(input))
    # output : 0