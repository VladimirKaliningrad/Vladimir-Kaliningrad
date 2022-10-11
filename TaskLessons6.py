#######1.Вводится список целых чисел в одну строчку через пробел. 
# Необходимо оставить в нем только двузначные числа. Реализовать программу 
# с использованием функции filter. Результат отобразить на экране в
# виде последовательности оставшихся чисел в одну строчку через пробел.


# numb_list = list(map(int, input('input numbers: ').split()))

# result = list(filter(lambda x: len(str(abs(int(x)))) == 2,numb_list))
# print(result)


########################################################################
####3. Преобразовать набора списков 
###### ZIP списки может обрезать, если надо по условиям задачи

# users = ['user1','user2','user3','user4','user5']
# ids = [4, 5, 9, 14, 7]
# salary = [111,222,333]
# в другой набор 

# ['user1', 4, 111]
# ['user2', 5, 222]
# ['user3', 9, 333]

# и потом вернуть в исходное состояние

# ['user1', 'user2', 'user3']
# [4, 5, 9]
# [111, 222, 333]

# users = ['user1','user2','user3','user4','user5']
# ids = [4, 5, 9, 14, 7]
# salary = [111,222,333]

# for i in zip(users, ids, salary):
#     print(i)

# users_1, ids_1, salary_1 = zip(*zip(users, ids, salary))
# users_1, ids_1, salary_1 = list(users_1), list(ids_1), list(salary_1)
# print(users_1)
# print(ids_1)
# print(salary_1)

###########################################################################
###########################################################

# n = int(input("Введите число N: "))
# i = 2 
# list = []

# while i <= n:
#     if n % i == 0:
#         list.append(i)
#         n //= i
#         i = 2
#     else:
#         i += 1
# print(f"Простые множители введенного\nчисла указаны в списке: {list}")

##########################################################
######################################################################
#
# 
# ffile1 = open('file1.txt', 'r')
# ffile2 = open('file2.txt', 'r')
# ffile3 = open('file3.txt', 'w')
# file1 = ffile1.readline()
# file2 = ffile2.readline()
# for i in range(len(file1)):
#     if file1[i-1] != '^':
#         if file1[i].isnumeric():
#             ffile3.write(str(int(file1[i])+int(file2[i])))
#         else:
#             ffile3.write(str(file1[i]))
#     else:
#         ffile3.write(str(file1[i]))
# ffile1.close
# ffile2.close
# ffile3.close
####################################################################
##################################################################
###################################################################
#
# 
#МНОГОЧЛЕНЫ МНОГОЧЛЕНЫ МНОГОЧЛЕНЫ###################################  


# import random
# def nmnogochlen1(a=random.randint(1, 100), b=random.randint(0, 100), c=random.randint(0, 100), res='') -> str:
    
#     if b > 0:
#         res += '+' + str(b) + '*x'
#     if c > 0:
#         res += '+' + str(c)
#     return f'{a}*x^2' + res

# def nmnogochlen2(a=random.randint(1, 100), b=random.randint(0, 100), c=random.randint(0, 100), res='') -> str:
#     if b > 0:
#         res += '+' + str(b) + '*x'
#     if c > 0:
#         res += '+' + str(c)
#     return f'{a}*x^2' + res

# f = open('dz40.txt', 'w')
# f.write(nmnogochlen1())
# print(nmnogochlen1())
# f.close()

# f = open('dz41.txt', 'w')
# f.write(nmnogochlen2())
# print(nmnogochlen2())
# f.close()
# f = open('dz40.txt', 'r')
# list_5 = str(f.readline()).split('x')
# c1 = b1 = a1 = 0
# if len(list_5) == 3:
#     c1 = list_5[2][1:]
# if len(list_5) >= 2:
#     b1 = list_5[1][3:-1]
# a1 = list_5[0][:-1]
# f.close()

# f = open('dz41.txt', 'r')
# list_51 = str(f.readline()).split('x')
# c2 = b2 = a2 = 0
# if len(list_51) == 3:
#     c2 = list_51[2][1:]
# if len(list_51) >= 2:
#     b2 = list_51[1][3:-1]
# a2 = list_51[0][:-1]
# f.close()

# f = open('dz42.txt', 'w')
# f.write(nmnogochlen1(int(a1) + int(a2), int(b1) + int(b2), int(c1) + int(c2)))

# print(nmnogochlen1(int(a1) + int(a2), int(b1) + int(b2), int(c1) + int(c2)))
# f.close()



######################################################################

# a = ( "a", 'b', '2', '3' ,'c')
# b = ( 'a' , 'b' , 'c')
# c = ( '1', '2', '3')
 

# b= filter(str.isalpha, a)
# c= filter(str.isdigit, a)

# print(*b)
# print(*c)

####################################################################
#
# 
# 
# задача списки ZIP обрезает, .....см
# users = ['user1','user2','user3','user4','user5']
# ids = [4, 5, 9, 14, 7]
# salary = [111,222,333]

# a,b,c = map(list,zip(users, ids, salary))
# print(a,b,c, sep="\n")
# a,b,c= map(list,zip(a,b,c))

# print(a,b,c, sep="\n")
###################################################################
#################################################################