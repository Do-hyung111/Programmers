def solution(age):
    answer = ''
    size = 1
    while (age//size != 0):
        size *= 10
    
    
    while(size != 1):
        size //= 10
        answer += chr(age//size+97)
        age -= (age//size)*size
    
    
    return answer