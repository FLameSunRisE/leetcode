class Solution:
    def diStringMatch(self, S):
        """
        :type S: str
        :rtype: List[int]
        """
        N = len(S)
        outPutList = []
        for num in range(N):
            if S[num] == "I":
                outPutList.append(num)
                pass
            else:
                outPutList.append(N-2)
                pass
            pass
        return outPutList

        
if __name__ == '__main__':
    solution = Solution()
    print (solution.diStringMatch("IDID"))
    print (solution.diStringMatch("III"))
    print (solution.diStringMatch("DDI"))