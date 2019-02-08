class Solution:
    def transpose(self, A: 'List[List[int]]') -> 'List[List[int]]':
        ans = []
        for x in range(len(A[0])):
            tmp = []
            for y in range(len(A)):
                tmp.append(A[y][x])
            ans.append(tmp)
        return ans

if __name__ == '__main__':
    solution = Solution()
    print(solution.transpose([[1,2,3],[4,5,6],[7,8,9]]))
    #  [[1,4,7],[2,5,8],[3,6,9]]
    print(solution.transpose([[1,2,3],[4,5,6]]))
    #  [[1,4],[2,5],[3,6]]