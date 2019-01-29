class Solution:
    def judgeCircle(self, moves):
        """
        :type moves: str
        :rtype: bool
        """
        moveList = list(moves)
        numU = moves.count("U")
        numD = moves.count("D")
        numR = moves.count("R")
        numL = moves.count("L")
        if numU==numD and numR==numL:
            return True
        else:
            return False
        
if __name__ == '__main__':
    solution = Solution()
    print (solution.judgeCircle("UD"))
    print (solution.judgeCircle("LL"))