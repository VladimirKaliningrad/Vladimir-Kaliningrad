from fractions import Fraction
from messages import error

def init_frac(string: str):
    a = Fraction(string)
    return a

def init_complex(string: str):
    a = complex(string)
    return a

def summ(a, b):
    return a + b

def subtract(a, b):
    return a - b

def mult(a, b):
    return a * b

def div(a, b):
    return a / b

def remainder(a, b):
    return a % b

def integer_div(a, b):
    return a // b

def power(a, b):
    return a ** b

def calculate(string: str):
    if 'i' in string:
        expression = [i.strip() for i in string.replace(',', '.').replace('i','j').split()]
        x = init_complex(expression[0])
        y = init_complex(expression[2])
    else:
        expression = [i.strip() for i in string.replace(',', '.').split()]
        x = init_frac(expression[0])
        y = init_frac(expression[2])
    if expression[1] == '+':
        return summ(x, y)
    elif expression[1] == '-':
        return subtract(x, y)
    elif expression[1] == '*':
        return mult(x, y)
    elif expression[1] == '/':
        return div(x, y)
    elif expression[1] == '%':
        return remainder(x, y)
    elif expression[1] == '//':
        return integer_div(x, y)
    elif expression[1] == '**':
        return power(x, y)
    else:
        return error