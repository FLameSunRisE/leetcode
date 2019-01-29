class Solution:
    def diStringMatch(self, S):
        """
        :type S: str
        :rtype: List[int]
        """
        N = len(S)
        A = list (range(0,N+1))
        outPutList = []
        for num in range(N):
            if S[num] == "I":
                outPutList.append(A.pop(0))
                pass
            else:
                outPutList.append(A.pop())
                pass
            pass
        if len(A) > 0:
            outPutList.append(A.pop())
        return outPutList

        
if __name__ == '__main__':
    solution = Solution()
    print (solution.diStringMatch("IDID"))
    print (solution.diStringMatch("III"))
    print (solution.diStringMatch("DDI"))