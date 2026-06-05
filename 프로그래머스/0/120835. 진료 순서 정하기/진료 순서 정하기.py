def solution(emergency):
    answer = []
    sorted = emergency.copy()
    sorted.sort()
    sorted.reverse()
    
    for i in emergency:
        answer.append(sorted.index(i)+1)
    
    return answer