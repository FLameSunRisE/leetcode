class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        # check length
        n = len(s)
        m = len(t)
        if n != m:
            return False
        
        #  dic check
        dic = {}
        for i in range(n):
            if s[i] in dic:
                if dic[s[i]] != t[i]:
                    return False
            elif t[i] in dic.values():
                return False
            else:
                dic[s[i]] = t[i]
        return True


def main():
    # Input:
    s = "egg"
    t = "add"
    # Output: true
    print(Solution().isIsomorphic(s, t))
    print('--------------------------------------------------------')
    # Explanation:
    # input
    s = "foo"
    t = "bar"
    # Output: false
    # Explanation:
    print(Solution().isIsomorphic(s, t))
    print('--------------------------------------------------------')
    # Explanation:
    # input
    s = "paper"
    t = "title"
    # Output: true
    # Explanation:
    print(Solution().isIsomorphic(s, t))


if __name__ == '__main__':
    main()
