# Задайте число. Составьте список чисел Фибоначчи, в том числе для 
# отрицательных индексов.
# Пример:
# - для k = 8 список будет выглядеть так: 
# [-21 ,13, -8, 5, −3, 2, −1, 1, 0, 1, 1, 2, 3, 5, 8, 13, 21]

fib1 = 0
fib2 = 1
n =int(input('Введите число, чтобы получить список чисел Фибоначчи\n:'))

result = str (fib1) + ' ' + str (fib2)
for i in range (1, n+1):
    fib1, fib2 = fib2, fib1 + fib2
    if i == n and i%2 !=0:
        result = str (fib1) + ' ' + result
    elif i%2==0 and i != n:
        result=str(-fib1)+ ' ' + result + ' '+str(fib2)
    elif i==n and i%2 ==0:
        result=str(-fib1) + ' ' + result
    else:
        result=str(fib1) + ' ' + result + ' ' + str(fib2) 
print(result)               



