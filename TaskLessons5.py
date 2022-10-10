# def f(x):
#     return x**3
# list = [(i, f(i)) for i in range(1,21) if i % 2 ==0 ]
# print (list)   #выводит кортеджи четные числа в кубе 2*2*2=8  например (2,8)

########################################################## 

# def select (f, col):
#     return [f(x) for x in col]

# def where (f, col):
#     return [x for x in col if f(x)]

# data = '1 2 3 5 8 15 23'.split()

# res = select (int, data)
# res = where (lambda x: not x % 2, res)
# res = select (lambda x : (x , x **2), res)
# print(res)   # вот такой результат [(2, 4), (8, 64)]

###############################################################  

# users = ['user1', 'user2', 'user3', 'user4', 'user5']
# ids = [4, 5, 9, 14, 7]
# salary = [111, 222, 333, 777]

# data = list(zip(users, ids, salary))
# print(data)  #зип пример [('user1', 4, 111), ('user2', 5, 222), ('user3', 9, 333), ('user4', 14, 777)]

#####################################################################

# users = ['user1', 'user2', 'user3', 'user4', 'user5']
# ids = [4, 5, 9, 14, 7]
# salary = [111, 222, 333, 777]

# data = list(enumerate(users))
# print(data) # пример [(0, 'user1'), (1, 'user2'), (2, 'user3'), (3, 'user4'), (4, 'user5')]

###################################################################
# list = []
# for i in range (1,101):
#     if (i % 2 == 0):
#         list.append(i);
# print(list)   # четные выводит в диапазоне с 1 по 101

#Алтернатива###################


# list = [i for i in range(1,101) if i % 2==0]
# print(list) # четные выводит в диапазоне с 1 по 101

##########################################################################
