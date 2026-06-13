def solution(numbers):
    numbers.sort()
    size = len(numbers)
    return numbers[size-1]*numbers[size-2]