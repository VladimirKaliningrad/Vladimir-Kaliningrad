#Реализуйте RLE алгоритм: 

#реализуйте модуль сжатия и восстановления данных.
#Входные и выходные данные хранятся в отдельных текстовых файлах.


#Сжатие-запаковщик

def rle_crypt(file_name: str):
    with open(file_name, 'r') as file:
        data = file.readlines()
    count = 1
    string = ''
    for i in data:
        for j in range(len(i)-1):
            if i[j] == i[j+1]:
                count += 1
            else:
                string += str(count) + i[j]
                count = 1
        string += str(count) + i[j+1]
    with open('crypted_data.txt', 'w') as file:
        file.write(string)
rle_crypt('data.txt')
