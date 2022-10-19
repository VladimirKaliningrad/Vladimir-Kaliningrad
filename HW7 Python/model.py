import sys
import view as v
import control as c

def stop_phonebook():
    sys.exit()

def read_phonebook():
    with open('phonebook.csv', 'r') as file:
        data = [line.strip().split(';') for line in file]
    fields = ['Фамилия', 'Имя', 'Номер телефона', 'Описание']
    output = [dict(zip(fields, record)) for record in data]
    return output

def add_contact():
    surname = input('Введите фамилию\n')
    name = input('Введите имя\n')
    phone_number = input('Введите телефон\n')
    description = input('Введите описание\n')
    with open('phonebook.csv', 'a') as file:
        file.write('{}; {}; {}; {}\n'.format(surname, name, phone_number, description))
    c.run_phonebook()

def add_contact_by_txt(filename: str):
    with open(filename, 'r', encoding='utf-8') as file:
        data = [line.strip().split(',') for line in file]
    with open('phonebook.csv', 'a') as file:
        for record in data:
            for value in record:
                file.write(f'{value};')
            file.write('\n')
    c.run_phonebook()

def add_contact_by_csv(filename: str):
    data = []
    with open(filename, 'r') as file:
        data = [line.strip('\n').split(';') for line in file]
    with open('phonebook.csv', 'a') as file:
        for record in data:
            for value in record:
                file.write(f'{value};')
            file.write('\n')
    c.run_phonebook()

def export_to_txt():
    data = read_phonebook()
    with open('phonebook.txt', 'a') as file:
        for line in data:
            for key, value in line.items():
                file.write(f'{value} ')
            file.write('\n')
    c.run_phonebook()

def find_by_phonenumber():
    data = read_phonebook()
    phone_number = input('Укажите номер телефона\n')
    flag = False
    for i in range(len(data)):
        if phone_number in data[i]['Номер телефона']:
            flag = True
            v.show_contact(i)
    if not flag:
        print('Номер не найден\n')
    c.run_phonebook()
            
def find_by_surname():
    data = read_phonebook()
    surname = input('Введите фамилию\n')
    flag = False
    for i in range(len(data)):
        if surname.lower() in data[i]['Фамилия'].lower():
            flag = True
            v.show_contact(i)
    if not flag:
        print('Совпадений не найдено\n')
    c.run_phonebook()