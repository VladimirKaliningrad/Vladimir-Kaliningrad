#Создайте программу для игры в ""Крестики-нолики"".

from random import randint


def check_input(data: str):
    while not data.isdigit() or not 1 <= int(data) <=9:
        data = input('Введено неверное значение. Повторите ввод\n')
    return data


def another_round():
    if input('Хотите сыграть еще? да / нет\n') == 'да':
        return True
    else:
        return False


def show_field(arr):
    print(f' {arr[0]} | {arr[1]} | {arr[2]}')
    print('--  --  --')
    print(f' {arr[3]} | {arr[4]} | {arr[5]}')
    print('--  --  --')
    print(f' {arr[6]} | {arr[7]} | {arr[8]}')
    print()


def check_field(arr):
    if arr[0] == 'X' and arr[1] == 'X' and arr[2] == 'X':
        return True
    elif arr[3] == 'X' and arr[4] == 'X' and arr[5] == 'X':
        return True
    elif arr[6] == 'X' and arr[7] == 'X' and arr[8] == 'X':
        return True
    elif arr[0] == 'X' and arr[3] == 'X' and arr[6] == 'X':
        return True
    elif arr[1] == 'X' and arr[4] == 'X' and arr[7] == 'X':
        return True
    elif arr[2] == 'X' and arr[5] == 'X' and arr[8] == 'X':
        return True
    elif arr[0] == 'X' and arr[4] == 'X' and arr[8] == 'X':
        return True
    elif arr[2] == 'X' and arr[4] == 'X' and arr[6] == 'X':
        return True
    elif arr[0] == '0' and arr[1] == '0' and arr[2] == '0':
        return True
    elif arr[3] == '0' and arr[4] == '0' and arr[5] == '0':
        return True
    elif arr[6] == '0' and arr[7] == '0' and arr[8] == '0':
        return True
    elif arr[0] == '0' and arr[3] == '0' and arr[6] == '0':
        return True
    elif arr[1] == '0' and arr[4] == '0' and arr[7] == '0':
        return True
    elif arr[2] == '0' and arr[5] == '0' and arr[8] == '0':
        return True
    elif arr[0] == '0' and arr[4] == '0' and arr[8] == '0':
        return True
    elif arr[2] == '0' and arr[4] == '0' and arr[6] == '0':
        return True
    else:
        return False


game_is_on = True
while game_is_on:
    cells = [1, 2, 3, 4, 5, 6, 7, 8, 9]
    free_cells = 9
    print('Добро пожаловать в игру "Крестики-нолики"!\n')
    game_mode = input('Выберите режим игры: 1 - игрок против игрока, 2 - игрок против компьютера\nexit - выход из игры\n').lower()

    if game_mode == '1':
        print('Выбран режим "Игрок против Игрока".\nИгрок 1 - крестики. Игрок 2 - нолики.\n')
        coin = randint(1,2)
        if coin == 1:
            player1 = True
        else:
            player1 = False
        finish = False
        while not free_cells == 0 and not finish:

            if player1:
                print('Игрок 1, ваш ход\n')
                show_field(cells)
                move = int(check_input(input('Выберите ячейку\n')))
                while cells[move-1] == 'X' or cells[move-1] == '0':
                    move = int(check_input(input('Эта ячейка уже занята! Выберите другую\n')))
                cells[move-1] = 'X'
                player1 = False
                free_cells -= 1
                finish = check_field(cells)
            else:
                print('Игрок 2 Ваш ход\n')
                show_field(cells)
                move = int(check_input(input('Выберите ячейку\n')))
                while cells[move-1] == 'X' or cells[move-1] == '0':
                    move = int(check_input(input('Эта ячейка уже занята! Выберите другую\n')))
                cells[move-1] = '0'
                player1 = True
                free_cells -= 1
                finish = check_field(cells)

        show_field(cells)
        if free_cells == 0:
            print('Ничья!')
            game_is_on = another_round()
        
        elif player1:
            print('Выиграл Игрок 2!')
            game_is_on = another_round()
        
        else:
            print('Выиграл Игрок 1!')
            game_is_on = another_round()
    if game_mode == '2':
        print('Выбран режим "Игрок против Компьютера".\nИгрок - крестики. Компьютер - нолики.\n')
        coin = randint(1,2)
        if coin == 1:
            player = True
        else:
            player = False
        finish = False
        while not free_cells == 0 and not finish:

            if player:
                print('Игрок 1, ваш ход\n')
                show_field(cells)
                move = int(check_input(input('Выберите ячейку\n')))
                while cells[move-1] == 'X' or cells[move-1] == '0':
                    move = int(check_input(input('Эта ячейка уже занята! Выберите другую\n')))
                cells[move-1] = 'X'
                player = False
                free_cells -= 1
                finish = check_field(cells)
            else:
                move = randint(0, len(cells)-1)
                while cells[move] == 'X' or cells[move] == '0':
                    move = randint(0, len(cells)-1)
                cells[move] = '0'
                player = True
                free_cells -= 1
                print('Компьютер делает ход\n')
                show_field(cells)
                finish = check_field(cells)

        show_field(cells)
        if free_cells == 0:
            print('Ничья!')
            game_is_on = another_round()
        
        elif player:
            print('Выиграл Компьютер!')
            game_is_on = another_round()
        
        else:
            print('Выиграл Игрок!')
            game_is_on = another_round()
                

    if game_mode == 'exit':
        print('До свидания!')
        game_is_on = False