
print('hello world')
print('hello world2')


#типы данных и переменная
# int, float, boolean, str, list, None

value = None

#print (type(value))

a = 123
b = 1.23
#print (type(a))  
#print(type(b))

value = 1234
#print(type(value))

s = '"hello \nworld"' # \n это на следующую строку
print(s)
print(type(s)) #вывод строки

print(a, b, s)                    #один способ вывода

print('{1}-{2}-{0}'.format(a, b, s)) #второй способ вывода
    #это 0 1 2 это индексы, то есть выводится сначало B потом S потом A

print(f'{a} {b} {s}')             #третьй способ вывода

#_____________________________________________________
f = True
print(f)


# списки вместо массивов
list = [1, 2, 3]
col = ['hello', 1,2,3, True] #миксованные данные

print(list)
print(col)
#print; input_________________________________________________
#ввод данных

print('Введите a');
a = int(input())
print('Введите b');
b = int(input())
print(a, '+',b, '=', a+b)

print('{} {}'.format(a,b))

print(f'{a} {b}')
#______________________________________________________
#логические операции

g = 1 > 2 #это при выводе False
print (g)

#____________________________________________________
#управляющие конструкции
# if, if-else

d = int(input('d = '))
e = int(input('e = '))
if d > e:
    print(d)
else:
    print(e)    
#___________________________________________
#if, elif проверка условий

username = input('Введите имя ')
if username == "Маша":
    print('Ура, это же Маша')
elif username == 'Марина':
    print ('Я так ждала вас Марина ')
elif username == 'Ильнар':
    print('Ильнар - молодец ')
else:
    print('Привет, ', username )        


