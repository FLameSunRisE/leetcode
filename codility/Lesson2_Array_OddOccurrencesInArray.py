# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")


def solution(A):
    # write your code in Python 3.6
    listA = list(set(A))
    ans = []
    for i in listA:
        ans.append(A.count(i))

    for i,data in enumerate(ans):
        if data % 2 != 0:
            return listA[i]
# O(N^2)

def solution2(A):
    if len(A) == 1:
        return A[0]
    A = sorted(A)       # O(n*log(N) or N)
    for i in range(0, len(A), 2):  # O(N)
        if i+1 == len(A):
            return A[i]
        if A[i] != A[i+1]:
            return A[i]
# O(N*log(N) or O(N))


def solution3(A):
    result = 0
    for number in A:
        result ^= number
    return result
# O(N)


def main():
    print(solution([9, 3, 9, 3, 9, 7, 9]))  #


if __name__ == '__main__':
    main()
