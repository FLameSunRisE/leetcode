# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")


def solution(N):
    # write your code in Python 3.6
    zeoDic = 0
    binaryRepresent = bin(N).split('b')[1]
    ans = []
    for index, binary in enumerate(binaryRepresent):
        if binary is '1':
            ans.append(zeoDic)
            zeoDic = 0
        elif binary is '0':
            zeoDic += 1
        pass
    pass

    return max(ans)

def main():
    print(solution(9))  #2
    print(solution(529))  # 4
    print(solution(20)) #1
    print(solution(15)) #0
    print(solution(32)) #0


if __name__ == '__main__':
    main()
