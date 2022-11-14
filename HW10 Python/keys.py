from aiogram.types import ReplyKeyboardMarkup, KeyboardButton, ReplyKeyboardRemove

b1 = KeyboardButton('/help')
b2 = KeyboardButton('/examples')

kb = ReplyKeyboardMarkup(resize_keyboard=True, one_time_keyboard=False)
kb.row(b1, b2)