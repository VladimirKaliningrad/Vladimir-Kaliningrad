#Напишите программу, удаляющую из текста все слова, 
# содержащие ""абв""


str = 'Напишите абв напиабв програбвмму программу,\n\
 удаляющую из этого абв текста все вабвс слова,\n\
 содерабващие содержащие "абв"'
# text_1 = list(filter(lambda x: 'абв' not in x, str.split(' '))) # функция lambda для элемента x в списке lst[] в split
# print(' '.join(lst))


text_1 = list(filter(lambda x: 'абв' not in x, str.split(' ')))
#text_1 = list(filter(lambda x: 'абв' not in x, str.split()))
print (' '.join(text_1))
