class Solution:
    def toGoatLatin(self, S: str) -> str:
        sentences = S.split(' ')
        vowels = 'AEIOUaeiou'
        ans = []
        for index,word in enumerate(sentences):
            if word[0] in vowels:
                ans.append(sentences[index]+'ma')
            else:
                ans.append(sentences[index][1:]+sentences[index][0]+'ma')
            ans[index] = ans[index]+('a'*(index+1))
        
        return " ".join(i for i in ans)
def main():
    ret = Solution().toGoatLatin("I speak Goat Latin")
    out = (ret)
    print(out)
    # Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"

    ret = Solution().toGoatLatin("The quick brown fox jumped over the lazy dog")
    out = (ret)
    print(out)
    # Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"


if __name__ == '__main__':
    main()
