import re
def solution(my_string):
    answer = re.findall(r"[0-9]",my_string)
    answer.sort()
    return list(map(int,answer))