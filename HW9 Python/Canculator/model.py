import sys


def calculate(operation: str):
    temp = operation.split()
    x = float(temp[0])
    y = float(temp[2])
    if '+' in temp:
        return x + y
    elif '-' in temp:
        return x - y
    elif '*' in temp:
        return x * y
    elif '**' in temp:
        return x ** y
    elif '%' in temp:
        return x % y
    elif '/' in temp:
        return x / y

def stop_calc():
    sys.exit()