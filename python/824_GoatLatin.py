
def stringToString(input):
    import json
    return json.loads(input)


class Solution:
    def toGoatLatin(self, S: str) -> str:

        return 's'
def main():
    S = stringToString("I speak Goat Latin")
    ret = Solution().toGoatLatin(S)
    out = (ret)
    print(out)
    # Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"

    S = stringToString("The quick brown fox jumped over the lazy dog")
    ret = Solution().toGoatLatin(S)
    out = (ret)
    print(out)
    # Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"


if __name__ == '__main__':
    main()
