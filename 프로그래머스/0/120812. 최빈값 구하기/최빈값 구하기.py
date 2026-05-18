def solution(array):
    max = 0
    answer = 0
    array.sort()
    
    for i in array:
        if(answer != i and array.count(i) == max):
            answer = -1
        elif(array.count(i) > max):
            answer = i
            max = array.count(i)
    
    return answer