class Solution:
    def transpose(self, A: 'List[List[int]]') -> 'List[List[int]]':
        ansList = []
        for i in range(len(A)+1):
            ansList.append([])
        print('ansList')
        print(ansList)
        for i in range(len(A)):
            print ('i:'+str(i))
            print (A[i])
            for x in range(len(A[i])):
                print ('--'+str(x))
                print ('--'+str(x)+':'+str(A[i][x]))
                ansList[x].append(A[i][x])
        print (ansList)
        return ansList

if __name__ == '__main__':
    solution = Solution()
    print(solution.transpose([[1,2,3],[4,5,6],[7,8,9]]))
    #  [[1,4,7],[2,5,8],[3,6,9]]
    print(solution.transpose([[1,2,3],[4,5,6]]))
    #  [[1,4],[2,5],[3,6]]