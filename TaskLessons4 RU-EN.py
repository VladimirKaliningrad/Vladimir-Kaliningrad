
###############################################################################################3
#########Task1##########################

t = ['a', 'b', 'v', 'g', 'd', 'e', 'zh', 'z', 'i', 'y', 'k', 'l', 'm', 'n', 'o', 'p', 'r', 's', 't', 'u', 'f', 'kh', 'ts', 'ch', 'sh', 'shch', '', 'y', '', 'e', 'yu', 'ya']

start_index = ord('а')     #Функция ord() для символа x вернет число, 
                           #из таблицы символов Unicode представляющее его позицию.
                           #Например, ord('a') возвращает целое число 97 и ord('€') вернет 8364.

title = 'Переводим этот текст, сейчас!'
print(title.lower())

slug = ""
for s in title.lower(): #нижний регистр - lover

	if "а" <= s <= "я":
		slug += t[ord(s) - ord('а')]
	
	else:
		slug += s


print(slug)

##########################################################
##Variant2###########################
# aplphabetE = \
# ['a', 'b', 'v', 'g', 'd', 'e', 'yo', 'zh', 'z', 'i', 'y', 'k', 'l', 'm', 'n', 'o', 'p','r', 
# 's', 't', 'u', 'f', 'kh', 'ts', 'ch', 'sh', 'shch', '', 'y', '\'', 'e', 'yu', 'ya']

# aplphabetR = \
# ['а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 
# 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я']

# base = input('Введите слово: ' )
# word=[]

# for i in range(len(base)):
#     word.append(aplphabetR.index(base[i]))
#     index = word[i]
#     print(aplphabetE[index], end='')

# print()


#############Task2###########################################################################
# Больше предыдущего
# На вход программе подается строка текста из натуральных чисел. 
# Из неё формируется список чисел. Напишите программу подсчета количества чисел, 
# которые больше предшествующего им в этом списке числа, то есть, 
# стоят вслед за меньшим числом. 
# Формат входных данных
# На вход программе подается строка текста из разделенных пробелами натуральных чисел.
# Формат выходных данных
# Программа должна вывести одно число – количество элементов списка, больших предыдущего.
# Тестовые данные 
# Sample Input 1:
# 1 2 3 4 5
# Sample Output 1:
# 4
# Sample Input 2:
# 1 1 3 2 2 1 1 1 1
# Sample Output 2:
# 1
# Sample Input 3:
# 5 4 3 2 1
# Sample Output 3:
# 0


# number_str = "5 4 3 2 1"
# spisok = []
# for i in number_str:
#     try:
#         i = int(i)
#         spisok.append(i)
#     except:
#         continue

# count = 0
# max = spisok[0]
# for i in spisok:
#     if i > max:
#         max = i
#         count += 1
    
# print(f"Количество чисел соответствующих условию: {count}")

##########################################################################################3
##########Task3#############################

# import random
# list = ["Anna", "Alex", 3.14159, 0]
# for i in range(len(list)):
#     index_a = random.randint(0, len(list) - 1)
#     list[i], list[index_a]=list[index_a],list[i]
######################################################################################
############Task4####################################
# import random
# n=int(input('input number '))
# list=[]
# for i in range(n):                      # генератор случайных чисел
#     a=random.randint(-n, n)
#     list.append(a)   
# print (list)
# index_list = input(f'введите позиции элементов от 1 до {n} через пробел').split()
# result=1
# for j in range(len(index_list)):
#     N = int(input("Введите число: "))      # перебор элементов с 
#     elements = list(range(-N, N+1))
#     print(elements)
# result = 1
# pos = open('file.txt', 'r')      
# for i in pos:
#     print(i)
#     result *= elements[int(i)]
# pos.close()
# print(result)                                  #От Дмитрий всем 08:10 PM



