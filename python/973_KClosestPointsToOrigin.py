class Solution:
    def square(self, list):
        return [i ** 2 for i in list]

    def kClosest(self, points: 'List[List[int]]', K: 'int') -> 'List[List[int]]':
        squPoints = []
        for index in range(len(points)):
            squPoints.append(sum(self.square(points[index])))

        sortSquIndex = sorted(range(len(squPoints)), key=lambda k: squPoints[k])
        ans = []
        num = 0
        while num < K:
            ans.append(points[sortSquIndex[num]])
            num += 1
        return ans



if __name__ == '__main__':
    solution = Solution()
    points = [[1, 3], [-2, 2]]
    k = 1
    print(solution.kClosest(points, k))
    points = [[3,3],[5,-1],[-2,4]]
    k = 2
    print(solution.kClosest(points, k))
    points = [[-2,10],[-4,-8],[10,7],[-4,-7]]
    k = 3
    print(solution.kClosest(points, k))
    
