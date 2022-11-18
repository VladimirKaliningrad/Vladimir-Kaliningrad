from random import randint

x = randint(0, 100)

count_perebor=0
#метод последовательного перебора
for i in range(0,101):
    count_perebor +=1
    if i ==x:
        print('Число найдено!')
        break
print('Загаданное число было ',x, 'и для его поиска потребовалось\n',count_perebor, 'итераций методом 1')

count_random=1
#метод случайного отгадывания
y=randint(0,100)
while x !=y: 
    y=randint(0,100)
    count_random +=1
print('Загаданное число было ',x, 'и для его поиска угадыванием потребовалось\n',count_random, 'итераций методом 2')


from random import randint

#вот тут поиск на миллион 20 итераций
right=1000000
left=0

x = randint(left,right)

count_bin=1
print('Давай начнем игру - угадай число от 0 до 100')


mid=(right+ left)// 2

#y=int(input('Введите число'))
while x!=mid:
    print(mid)
    if x<mid: 
        print ('меньше')
        right =mid-1 
    else:
        print('больше')
        left= mid+1
    mid=(right + left) // 2        

     #y=int(input('Введи число '))
    count_bin +=1

print('Загаданное число было ',x, 'и для его поиска бинарным алгоритмом потребовалось\n',count_bin, 'итераций методом 3')


# def binary_search(list_for_search, search_namber):
# count = 0
# start_list = 0
# stop_list = len(list_for_search) - 1
# while start_list <= stop_list:
# count += 1
# middle = ((start_list + stop_list) // 2)
# if list_for_search[middle] == search_namber:
# return (middle, list_for_search[middle], count)
# elif list_for_search[middle] > search_namber:
# stop_list = middle - 1
# else:
# start_list = middle + 1
# return None

#def binary_search_recursion(list_for_search, search_namber, start_list, stop_list):
#if start_list > stop_list:
#return None
#else:
#middle = ((start_list + stop_list) // 2)
#if list_for_search[middle] == search_namber:
#return middle, list_for_search[middle]
#elif list_for_search[middle] > search_namber:
#return binary_search_recursion(list_for_search, search_namber, start_list, middle - 1)
#else:
#return binary_search_recursion(list_for_search, search_namber, middle + 1, stop_list)