import model
from random import randint


def check_for_number(data: str):
    while not data.isdigit():
        data = input('Введено неверное значение. Повторите ввод.\n')
    return data

def main_menu():
    print('Выберите необходимое действие:\n\
1. Найти сотрудника\n\
2. Сделать выборку сотрудников по должности\n\
3. Сделать выборку сотрудников по зарплате\n\
4. Добавить сотрудника\n\
5. Удалить сотрудника\n\
6. Обновить данные сотрудника\n\
7. Экспортировать данные в формате json\n\
8. Завершить работу')
    return int(check_for_number(input()))

def show_employee(employee: dict):
    fields = ['ID','Фамилия','Имя','Должность','Зарплата','Телефон']
    output = dict(zip(fields, list(employee.values())))
    for key, value in output.items():
        print(f'{key}: {value}', sep=' ', end='\n')
    print('\n')

def get_employee_info():
    employee = {}
    employee['id'] = model.check_id(randint(1, 1000))
    employee['last_name'] = input('Введите фамилию сотрудника\n')
    employee['first_name'] = input('Введите имя сотрудника\n')
    employee['position'] = input('Введите должность сотрудника\n')
    employee['salary'] = float(input('Введите зарплату сотрудника\n'))
    employee['phone'] = input('Введите номер телефона сотрудника\n')
    return employee
 
def get_last_name():
    return input('Введите фамилию сотрудника\n')

def get_employee_position():
    return input('Введите должность сотрудника\n')

def get_salary_range():
    salary_range = list(map(float, input('Введите диапазон через тире\n').split('-')))
    return salary_range

def get_id():
    return int(check_for_number(input('Введите ID сотрудника\n')))

def get_updated_info(employee: dict):
    employee['last_name'] = input('Введите фамилию сотрудника\n')
    employee['first_name'] = input('Введите имя сотрудника\n')
    employee['position'] = input('Введите должность сотрудника\n')
    employee['salary'] = float(input('Введите зарплату сотрудника\n'))
    employee['phone'] = input('Введите номер телефона сотрудника\n')
    return employee