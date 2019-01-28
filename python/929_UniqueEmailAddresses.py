class Solution:
    def numUniqueEmails(self, emails):
        """
        :type emails: List[str]
        :rtype: int
        """
        ansList = []
        for email in emails:
            print(email)
            local_name ,domain_name = email.split('@',1)
            local_name = local_name.split("+",1)
            local_name = local_name[0].replace(".","")
            ansList.append(local_name+"@"+domain_name)
            pass
        ansSet = set(ansList)
        return len(ansSet)

        
emails = ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]

if __name__ == '__main__':
    solution = Solution()
    print (solution.numUniqueEmails(emails))
