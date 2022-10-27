def get_operation():
    print('Введите выражение, отделяя математический знак пробелами\n\
Если надоест - введите exit')
    return input().lower()

def show_result(operation, result):
    print(f'{operation} = {result}')

def show_error_message():
    print('Введено неверное выражение\n')