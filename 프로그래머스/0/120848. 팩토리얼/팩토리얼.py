import math

def solution(n):
    for i in range(1,n+2):
        if(math.factorial(i) > n):
            return i-1