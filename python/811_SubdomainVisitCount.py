import collections
class Solution:
    def subdomainVisits(self, cpdomains: 'List[str]') -> 'List[str]':
        print(cpdomains)
        ans = collections.Counter()
        # ans = []
        output = []
        for word in cpdomains:
            count, domain = word.split()
            count = int(count)
            frags = domain.split('.')
            for i in range(len(frags)):
                ans[".".join(frags[i:])] += count
        for domain , count in ans.items():
            output.append("{} {}".format(count,domain ))
        return output

if __name__ == '__main__':
    solution = Solution()
    print(solution.subdomainVisits(["9001 discuss.leetcode.com"]))
    #  ["9001 discuss.leetcode.com", "9001 leetcode.com", "9001 com"]
    print(solution.subdomainVisits(
        ["900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"]))
    #  ["901 mail.com","50 yahoo.com","900 google.mail.com","5 wiki.org","5 org","1 intel.mail.com","951 com"]
