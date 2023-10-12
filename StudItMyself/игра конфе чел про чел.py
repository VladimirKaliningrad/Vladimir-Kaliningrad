# Создайте программу для игры с конфетами человек против человека.

# Условие задачи: На столе лежит 2021 конфета. 
# Играют два игрока делая ход друг после друга. 
# Первый ход определяется жеребьёвкой. 
# За один ход можно забрать не более чем 28 конфет. 
# Все конфеты оппонента достаются сделавшему последний ход. 
# Сколько конфет нужно взять первому игроку, чтобы забрать все конфеты у своего конкурента?

# a) Добавьте игру против бота
# b) Подумайте как наделить бота ""интеллектом""

from random import randint


def check_input(data: str):
    while not data.isdigit():
        data = input('Введено неверное значение. Повторите ввод\n')
    return data

def another_round():
    if input('Хотите сыграть еще? да / нет\n') == 'да':
        return True
    else:
        return False


game_is_on = True
while game_is_on:
    print('Добро пожаловать в игру!\nПравила игры следующие: На столе лежит 2021 конфета. Первый ход определяется жеребьёвкой.\n\
За один ход можно забрать не более чем 28 конфет. Все конфеты оппонента достаются сделавшему последний ход игроку.')
    game_mode = input('Выберите режим игры: 1 - игрок против игрока, 2 - игрок против компьютера, 3 - игрок против "умного" компьютера\n\
    exit - выход из игры\n').lower()

    if game_mode == '1':
        total = 2021
        coin = randint(1, 2)
        if coin == 1:
            print('Первым ходит игрок 1')
            player1 = True
            print('Первым ходит игрок 2')
            player1 = False
        while total > 0:
            if player1:
                move = int(check_input(input('Ход игрока 1\n Сколько конфет вы возьмете?\n')))
                if total > 28:
                    while not 0 <= move <= 28:
                        move = int(check_input(input('Вы не можете взять столько конфет. Повторите попытку\n')))
                elif total <= 28:
                    while not 0 <= move <= total:
                        move = int(check_input(input('Вы не можете взять столько конфет. Повторите попытку\n')))
                total -= move
                player1 = False
                print(f'Игрок 1 взял {move} конфет. Осталось {total} конфет')
            else:
                move = int(check_input(input('Ход игрока 2\n Сколько конфет вы возьмете?\n')))
                if total > 28:
                    while not 0 <= move <= 28:
                        move = int(check_input(input('Вы не можете взять столько конфет. Повторите попытку\n')))
                elif total <= 28:
                    while not 0 <= move <= total:
                        move = int(check_input(input('Вы не можете взять столько конфет. Повторите попытку\n')))
                total -= move
                player1 = True
                print(f'Игрок 2 взял {move} конфет. Осталось {total} конфет')
        if player1:
            print('Последний ход сделал Игрок 2, все конфеты достаются ему\n Конец игры')
        else:
            print('Последний ход сделал Игрок 1, все конфеты достаются ему\n Конец игры')
        game_is_on = another_round()


    elif game_mode == '2':
        total = 2021
        coin = randint(1, 2)
        if coin == 1:
            player = True
            print('Первым ходит Игрок')
        else:
            player = False
            print('Первым ходит компьютер')
        while total > 0:
            if player:
                move = int(check_input(input('Ваш ход. Сколько конфет вы возьмете?\n')))
                if total > 28:
                    while not 0 <= move <= 28:
                        move = int(check_input(input('Вы не можете взять столько конфет. Повторите попытку\n')))
                elif total <= 28:
                    while not 0 <= move <= total:
                        move = int(check_input(input('Вы не можете взять столько конфет. Повторите попытку\n')))
                total -= move
                player = False
                print(f' Вы взяли {move} конфет. Осталось {total} конфет')
            else:
                if total > 28:
                    move = randint(1, 28)
                    total -= move
                    player = True
                    print(f'Компьютер берет {move} конфет. Осталось {total} конфет')
                elif total <= 28:
                    move = randint(1, total)
                    total -= move
                    player = True
                    print(f'Компьютер берет {move} конфет. Осталось {total} конфет')
        if player:
            print('Последний ход сделал компьютер и забрал себе все конфеты\nКонец игры')
        else:
            print('Поздравляем! Вы сделали последний ход и все конфеты достаются вам!\nКонец игры')
        game_is_on = another_round()

    elif game_mode == '3':
        total = 2021
        coin = randint(1,2)
        if coin == 1:
            player = True
            print('Первым ходит Игрок')
        else:
            player = False
            print('Первым ходит компьютер')
        while total > 0:
            if player:
                move = int(check_input(input('Ваш ход. Сколько конфет вы возьмете?\n')))
                if total > 28:
                    while not 0 <= move <= 28:
                        move = int(check_input(input('Вы не можете взять столько конфет. Повторите попытку\n')))
                elif total <= 28:
                    while not 0 <= move <= total:
                        move = int(check_input(input('Вы не можете взять столько конфет. Повторите попытку\n')))
                total -= move
                player = False
                print(f'Вы взяли {move} конфет. Осталось {total} конфет')
            else:
                if total > 28:
                    move = total % 29
                    total -= move
                    player = True
                    print(f'Компьютер берет {move} конфет. Осталось {total} конфет')
                elif total <= 28:
                    move = total
                    total -= move
                    player = True
                    print(f'Компьютер берет {move} конфет. Осталось {total} конфет')
        if player:
            print('Последний ход сделал компьютер и забрал себе все конфеты\n Конец игры')
        else:
            print('Поздравляем! Вы сделали последний ход и все конфеты достаются вам!\nКонец игры')
        game_is_on = another_round()

    elif game_mode == 'exit':
        print('До свидания!')
        game_is_on = False