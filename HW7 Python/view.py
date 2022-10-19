import model as m
import control as c

def check_for_num(data: str):
    while not data.isdigit():
        data = input('Введено неверное значение. Повторите ввод\n')
    return data

def show_menu():
    print('Выберите действие\n\
1 - показать весь справочник\n\
2 - найти контакт по фамилии\n\
3 - найти контакт по номеру телефона\n\
4 - добавить контакт вручную\n\
5 - добавить контакт из файла\n\
6 - сохранить справочник в текстовый файл\n\
7 - завершить работу\n')
    choice = int(check_for_num(input()))
    return choice

def show_phonebook():
    data = m.read_phonebook()
    for line in data:
        for key, value in line.items():
            print(f'{key}: {value}')
        print('\n')
    c.run_phonebook()

def show_contact(num):
    data = m.read_phonebook()
    for key, value in data[num].items():
        print(f'{key}: {value}')
    print('\n')

def get_filename():
    name = input('Введите имя файла\n')
    return name