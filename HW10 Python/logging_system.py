from datetime import datetime
from aiogram import types

def message_logger(message: types.Message, result):
    with open('log.txt', 'a') as f:
        f.write(f'Дата: {datetime.now().strftime("%d-%m-%Y %H.%M.%S")}\
 Пользователь: {message.from_user.username}\
 ID пользователя: {message.from_user.id}\
 Имя: {message.from_user.first_name}\
 Фамилия: {message.from_user.last_name}\
 Сообщение: {message.text}\
 Результат: {result}\n')

def err_logger(message: types.Message, err):
    with open('log.txt', 'a') as f:
        f.write(f'Дата: {datetime.now().strftime("%d-%m-%Y %H.%M.%S")}\
 Пользователь: {message.from_user.username}\
 ID пользователя: {message.from_user.id}\
 Имя: {message.from_user.first_name}\
 Фамилия: {message.from_user.last_name}\
 Сообщение: {message.text}\
 Ошибка: {err}\n')