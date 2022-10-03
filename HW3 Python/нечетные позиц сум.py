# Задайте список из нескольких чисел. Напишите программу, которая 
# найдёт сумму элементов списка, стоящих на нечётной позиции.
# Пример:
# - [2, 3, 5, 9, 3] -> на нечётных позициях элементы 3 и 9, ответ: 12

from random import randint

num = []
for i in range(randint(1, 6)):
    num.append(randint(1, 10))

result = 0
for i in range(len(num)):
    if i % 2 != 0:
        result += num[i]
print(num, result, sep=': ')