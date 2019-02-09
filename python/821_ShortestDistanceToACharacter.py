class Solution:
    def shortestToChar(self, S: 'str', C: 'str') -> 'List[int]':
        ans = []
        listS = list(S)
        keyCharList = [i for i, e in enumerate(S) if e == C]
        for i in range(len(listS)):
            if i in keyCharList:
                ans.append(0)
            else:
                tmp = []
                for x in keyCharList:
                    tmp.append(abs(int(x)-i))
                ans.append(min(tmp))
        return ans


if __name__ == '__main__':
    solution = Solution()
    # Input: S = "loveleetcode", C = 'e'
    print(solution.shortestToChar("loveleetcode", 'e'))
    # Output:  [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
    inputS = "kzztfpvjmoxadcigkuxcvmlpfjgvxmmbekqxfnxnuwohcszsezwzhdcxpglroypmuobdflqmttergssgvgourdwdsexonckwhduovdhdesninellcturjhgcjwvipnsishrwtfsfnrahjajnnxkkemesdwgiyiqqrluuadaxoueyurqrvzbcshxxflywfhdzkphagyoctygznpalauzstoupnjbrgrpqslsxpqbqkggtushtkllxhgxzbdmhnbzxkwzxtaanmhtoirxheyanoplbvjrovzudznmetkkxrdmrhvmldbhqtriygqfmbtzppxgclrjjywhzzurdntkwpnhlejhfppvqjagszcnudmzwwcyuaqzgtudmpjkluqoseslygywzkixjqghsocvjqigvxwqloyugfhcjscjghqmiglgyazwelshzapaezqgmcmrmfrfzttdgquizyducbvxzzuiddcnwuaapdunzlbagnifndbjyalqqgbramhbivvervxrtcszszwigrlwzmuteyswzagudtpvlrjmobuhozbghkhvoxawcxmjnazlqlkqqqnoclufgkovbokvkoezeknwhcfgcenvaablpvtcejvzndtzncrelhedwlwiqgdbdgctgubzczgtovufncicjlwsmfdcrqeaghuevyexqdhffikvecuazrelofjmyjjznnjdkimbklrhsjusbstqhvlejtjcczqnzbvyfzxgaudyosckysmminoanjmbafhtnbrrzqagllwxlxmjanyfelmwruftlzuuhbsjexoobjkmymlitiwjtdxscotzvznvixpdhnsxsodieatipiaodgcmdgyvzrjrvfccmecchxtiraiqijowzwnrvrkosimqsdyrscbonppjteyoebnuomrbifrbqbteclfqztbbyroomrehvfwtrvcodllgjctguxeicjoudmxbevzrvravkidnricwsbnxmxvdc"
    print(solution.shortestToChar(inputS, 'j'))
