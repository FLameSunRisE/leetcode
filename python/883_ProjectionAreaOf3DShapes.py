class Solution:
    def projectionArea(self, grid: 'List[List[int]]') -> 'int':
        xy,yz,xz = 0,0,0
        N = len(grid)
        for i in range(N):
            tmpYZ,tmpXZ = 0,0
            for j in range(N):
                if grid[i][j]!=0:
                    xy += 1
                tmpYZ = max(tmpYZ,grid[j][i])
                tmpXZ = max(tmpXZ,grid[i][j])
            yz += tmpYZ
            xz += tmpXZ
        return xy+yz+xz

if __name__ == '__main__':
    solution = Solution()
    print (solution.projectionArea([[2]])) #5
    print (solution.projectionArea([[1,2],[3,4]])) #17
    print (solution.projectionArea([[1,0],[0,2]])) #8
    print (solution.projectionArea([[1,1,1],[1,0,1],[1,1,1]])) #14
    print (solution.projectionArea([[2,2,2],[2,1,2],[2,2,2]])) #21