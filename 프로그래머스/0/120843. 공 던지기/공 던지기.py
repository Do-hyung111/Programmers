def solution(numbers, k):
    cnt = 0
    idx = 0
    answer = 0
    while(cnt < k):
        print("idx: ", idx, ", cnt: ", cnt, ", num: ",numbers[idx])
        cnt += 1
        idx += 2
        if(idx == len(numbers)):
            idx = 0
        elif(idx == len(numbers)+1):
            idx = 1
    
    return numbers[idx-2]