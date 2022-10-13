# Напишите программу, которая будет преобразовывать десятичное число в двоичное

# num = int(input('Введите число '))
# result = ''
# while num > 0:
#     if num % 2 == 0:
#         result = '0' + result
#     else:
#         result = '1' + result
#     num //= 2
# print(result)

num = int(input('Введите число '))
result = ''
while num > 0:
    result = (lambda x: '0' if x % 2 == 0 else '1')(num) + result
    num //= 2
print(result)