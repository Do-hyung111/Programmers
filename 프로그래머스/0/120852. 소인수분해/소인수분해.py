def solution(n):
    answer = []
    cnt = 1;
    while(n!=1):
        cnt += 1
        if(n%cnt==0):
            n //= cnt
            answer.append(cnt)
            cnt = 1
    answer = list(set(answer))
    answer.sort()
    return answer