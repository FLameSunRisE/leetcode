class Solution:
    def subdomainVisits(self, cpdomains):
        """
        :type cpdomains: List[str]
        :rtype: List[str]
        """
        ans = collections.Counter()
        for domain in cpdomains:
            count, domain = domain.split()
            count = int(count)
            frags = domain.split('.')
            for i in range(len(frags)):
                ans[".".join(frags[i:])] += count
                ans += ax + by

        return ["{} {}".format(ct, dom) for dom, ct in ans.items()]
    
    
#         dominList = []               
#         dataList = []    
#         for x in cpdomains:
#             tmpList = x.split(" ",1)
#             num = tmpList[0]
#             domain = tmpList[1]
#             splitDomList = domain.split(".")
#             print(splitDomList)
#             reDomList = list(reversed(splitDomList))
#             print (reDomList)
#             for y in reDomList:
#                 try:
#                     print(dominList.index(y))
#                 except ValueError:
#                     print('ValueError')
              
            
#         return [""]

if __name__ == '__main__':
    solution = Solution()
    print(solution.subdomainVisits([[1,2,3],[4,5,6],[7,8,9]]))
    #  [[1,4,7],[2,5,8],[3,6,9]]
    print(solution.subdomainVisits([[1,2,3],[4,5,6]]))
    #  [[1,4],[2,5],[3,6]]