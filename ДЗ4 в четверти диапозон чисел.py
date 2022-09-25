# Напишите программу, которая по заданному номеру четверти,
# показывает диапазон возможных координат точек в этой четверти (х и у)

quarter = int(input('Введите порядковый номер четверти\n'))
while not 1 <= quarter <= 4:
    quarter = int(input('Введено неверное значение \nПовторите ввод\n'))
if quarter == 1:
    print('X(0, +inf) Y(0, +inf)')
elif quarter == 2:
    print('X(-inf, 0) Y(0, +inf)')
elif quarter == 3:
    print('X(-inf, 0) Y(-inf, 0)')
elif quarter == 4:
    print('X(0, +inf) Y(-inf, 0)')