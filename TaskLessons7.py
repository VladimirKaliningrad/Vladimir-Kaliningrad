#############напечатать сторку в одну линию - C:\WINDOWS\System32\drivers\etc\nst##


#print ('C:\WINDOWS\System32\drivers\etc\\nst')



############записать в список все буквы строки f=‘privet’##############################

# f = 'privet'
# list= []
# list = [ i for i in f]
# print(list)



##################преобразовать список таким образом##############################
# a = [4, 3, -10, 1, 7, 12]
# [4, -10, 12, 3, 1, 7]
# выход

# a=[ 4, 3, -10, 1, 7, 12]
# print(*list(filter(lambda x:not x % 2, a)), end = ' ')
# print(*list(filter(lambda x: x % 2, a)))

# a = [4, 3, -10, 1, 7, 12]
# a.sort(key=lambda x: x%2)
# print(a)




#########На вход программы поступает список наименований рек,########################### 
# записанных в одну строчку через пробел. Необходимо отсортировать 
# этот список в порядке убывания длин названий. Результат вывести в 
# одну строчку через пробел.

# Sample Input:
# Лена Енисей Волга Дон
# Sample Output:
# Енисей Волга Лена Дон


# s=sorted(input().split(), key=lambda x: len(x))[::-1]
# print(*s)



########################## Вводится строка. Требуется, используя введенную строку, 
# сформировать N=10 пар кортежей в формате:
# (символ, порядковый индекс)
# Первый индекс имеет значение 0. Строка может быть короче 10 символов, 
# а может быть и длиннее. То есть, число пар может быть 10 и менее. 
# Используя функцию zip сформируйте указанные кортежи и сохраните в список с именем lst.



s = input()
lst = list(zip(s, range(12)))
print(lst)




###############Напишите программу, которая подсчитает и выведет сумму квадратов всех 
# двузначных чисел, делящихся на 9.
# При решении задачи используйте комбинацию функций filter, map, sum.
# Обратите внимание: на 9 должно делиться исходное двузначное число, а не его квадрат.


# l_value = [23, 63, 2, 81 ,34, 234]
# l_value = filter(lambda x: (9 < x < 100) and (x % 9 == 0),  l_value)
# l_value = map(lambda x: x**2, l_value)
# print(sum(l_value))





# ##########  Напишите функцию triangle(a, b, c), которая принимает на вход три длины 
# отрезков и определяет, можно ли из этих отрезков составить треугольник. 
# Входные данные
# Выходные данные
# triangle(1, 1, 2)
# Это не треугольник
# triangle(7, 6, 10)


# triangle = [7,6,10]
# triangle.sort()
# is_triangle = triangle[0] + triangle[1] > triangle[2]

# if is_triangle:
#     print('Это треугольник!')
# else:
#     print('Это не треугольник!')


####################################################################################


# def show_menu() -> int:
#     print("\nВыберите необходимое действие:\n"
#           "1. Отобразить весь справочник\n"
#           "2. Найти абонента по фамилии\n"
#           "3. Найти абонента по номеру телефона\n"
#           "4. Добавить абонента в справочник\n"
#           "5. Сохранить справочник в текстовом формате\n"
#           "6. Закончить работу")
#     choice = int(input())
#     return choice


#####################################################################################


# phone_book = read_csv('phonebook.csv')
# def read_csv(filename: str) -> list:
#     data = []
#     fields = ["Фамилия", "Имя", "Телефон", "Описание"]
#     with open(filename, 'r', encoding='utf-8') as fin:
#         for line in fin:
#             record = dict(zip(fields, line.strip().split(',')))
#             data.append(record)

#     return data