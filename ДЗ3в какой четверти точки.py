# Напишите программу, которая принимает на вход координаты точки (X и Y), причём X ≠ 0 и Y ≠ 0
# выдаёт номер четверти плоскости, в которой находится эта точка (или на какой оси она находится).
# - x=34; y=-30 -> 4
# - x=2; y=4-> 1
# - x=-34; y=-30 -> 3

print('Введите координаты точки (X и Y), чтобы узнать в какой четверти плоскости эта точка')

x = int(input('X = '))
y = int(input('Y = '))

while x == 0 or y == 0:
    print ('Координаты X и Y не могут быть равны нулю, повторите ввод')
    х = int(input('X = '))
    y = int (input('Y = '))

if x > 0:
    if y > 0:
        print('Точка находится в 1 четверти')
    else:
        print('Точка находится в 4 четверти')

elif x < 0:
    if y > 0:
        print('Точка находится во 2 четверти')
    else:
        print('Точка находится в 3 четверти')    


