# Напишите программу, которая принимает на вход цифру, обозначающую день недели, и проверяет, является ли этот день выходным.
# Пример:
# - 6 -> да
# - 7 -> да
# - 1 -> нет

print(' Введите цифру, обозначающую день недели,\n программа ответит Вам является ли этот день выходным')
number = int (input())
while number < 1 or number > 7:
    print('Введенное Вами число не соответствует дню недели, повторите ввод')
    number = int(input())

else: 
    if number == 6 or number == 7:
        print('Этот день выходной') 
    else:
        print('Этот будний день')     




