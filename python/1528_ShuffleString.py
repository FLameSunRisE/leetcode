class Solution:
    def restoreString(self, s: str, indices: List[int]) -> str:
        size = len(s);
        rtnList = [''] * size;
        
        for idex, val in enumerate(s):
            rtnList[ indices[idex] ] = val
        
        return ''.join(rtnList)
        


def main():
    print(Solution().restoreString("codeleet",[4,5,6,7,0,2,1,3]))
    # Output: 
    print(Solution().restoreString("abc",[0,1,2]))
    # Output: 


if __name__ == '__main__':
    main()