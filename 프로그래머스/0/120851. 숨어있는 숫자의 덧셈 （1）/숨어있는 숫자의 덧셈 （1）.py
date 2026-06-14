import re
def solution(my_string):
    answer = 0
    temp = re.findall(r"[0-9]",my_string)
    temp = list(map(int, temp))
    for i in temp:
        answer += i
    return answer