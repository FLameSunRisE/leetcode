class Solution:
    def numJewelsInStones(self, J, S):
        """
        :type J: str
        :type S: str
        :rtype: int
        """
        listJ = list(J)
        listS = list(S)
        count = 0
        for i in range(0,len(listJ)):
            for j in range(0,len(listS)):
                if listJ[i] == listS[j]:
                    count += 1
        return count

if __name__ == '__main__':
    solution = Solution()
    print (solution.numJewelsInStones("aA","aAAbbbb"))
    print (solution.numJewelsInStones("z","ZZ"))