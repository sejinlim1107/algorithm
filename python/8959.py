T = int(input())
S = list(input() for _ in range(T))

cnt = 0
score = 0

for ch in S:
    for i in range(len(ch)):
        if ch[i] == 'O':
            cnt += 1
            score += cnt
        else:
            cnt = 0
    print(score)
    score = 0
    cnt = 0
