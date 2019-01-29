class Solution:
    def minDeletionSize(self, A):
        """
        :type A: List[str]
        :rtype: int
        """
        count = 0
        for col in zip(*A):
            if sorted(col) != list(col):
                count += 1
        return count

        # for num in range(len(A[0])):
        #     tmp = []
        #     for word in A:
        #         tmp.append(ord(word[num]))
        #         pass
        #     if sorted(tmp) != tmp:
        #         count += 1
        #     pass

if __name__ == '__main__':
    solution = Solution()
    print (solution.minDeletionSize(["cba","daf","ghi"]))
    print (solution.minDeletionSize(["a","b"]))
    print (solution.minDeletionSize(["zyx","wvu","tsr"]))