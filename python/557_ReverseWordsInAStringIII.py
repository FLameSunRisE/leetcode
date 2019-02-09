class Solution:
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        strList = s.split(' ')
        res = ''
        resList = []
        for s in range(len(strList)):
            splitStr = strList[s][::-1]
            if(s == len(strList)-1):
                res += splitStr
            else:
                res += splitStr+' '            
        return res