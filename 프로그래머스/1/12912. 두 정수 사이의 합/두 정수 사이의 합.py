def solution(a, b):
    answer = 0
    if a>b:
        small = b
        big = a
    else:
        small = a
        big = b
        
    for i in range(small,big+1):
        answer += i;
    
    return answer