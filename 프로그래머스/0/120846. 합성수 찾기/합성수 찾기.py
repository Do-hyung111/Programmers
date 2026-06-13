def solution(n):
    answer = 0
    for i in range(1,n+1):
        if(composite(i)):
            answer+=1
            print(i)
    
    return answer



def composite(n):
    for i in range(2, n):
        if(n%i == 0):
            return True
    return False
    