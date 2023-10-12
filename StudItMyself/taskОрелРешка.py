#на вход программе подается строка текста, состоящая из букв русского
#алфавита "О" и "Р"
# формат выходных данных
# программа должна вывести наибольшее количество подряд выпавших Решек
#
#примечание, если выпавших Решек нет, то необходимо вывести число 0

# несовсем работает версия, см ниже
# import random
# x = int(input('введите длину строки: '))
# O_or_P = ''
# for i in range(x):
#     gen = random.randint(0,2)
#     if gen == 0:
#         O_or_P += 'О'
#     else:
#         O_or_P += 'Р'

# print(O_or_P)
# print(len(O_or_P))

# count = 0
# max_count = 0
# for i in range(len(O_or_P)):
#     if O_or_P[i] == 'Р':
#         count +=1
#         if max_count < count:
#             max_count = count
#     else:
#         count = 0
############################################################################
#######Вариант 2#######################


# tosses = input ('Введите результат подбрасываний: ')
# repeats_headds = 0
# max_repeats = 0

# for i in range(len(tosses)-1):
#     if (tosses[i]=='Р' and tosses [i+1] =='Р'):
#         repeats_headds +=1
#     elif (tosses[i]=='Р' and tosses [i+1 == 'О']):
#         if max_repeats < repeats_headds:
#             max_repeats=repeats_headds
#         repeats_headds=0

# print(max_repeats +1)            

#########################################
###вариант3##############################
s=input('Введите результат подбрасывай: ')
t=0
while "р"*(t+1) in s:
    t+=1
if t!=0:
    print(t)
else:
    print(0)        
