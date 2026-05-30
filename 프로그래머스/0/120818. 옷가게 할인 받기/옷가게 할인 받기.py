def solution(price):
    profit = 0
    if(price<100000):
        profit = price
    elif(price<300000):
        profit = price*(95/100)
    elif(price<500000):
        profit = price*(9/10)
    else:
        profit = price*(4/5)
    
    return int(profit)