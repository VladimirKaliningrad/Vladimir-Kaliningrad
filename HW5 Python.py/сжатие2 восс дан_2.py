#Реализуйте RLE алгоритм: 
#реализуйте модуль сжатия и восстановления данных.
#Входные и выходные данные хранятся в отдельных текстовых файлах

# Восстановление , RLE распаковщик

def rle_decrypt(file_name: str):
    with open(file_name, 'r') as file:
        cr_data = ''.join(file.readlines())
    arr = []
    string = ''
    for i in range(len(cr_data)):
        if cr_data[i].isdigit():
            string += cr_data[i]
        else:
            arr.append([int(string), cr_data[i]])
            string = ''
    decr_data = ''
    for i in arr:
        for j in range(len(i)-1):
            decr_data += i[j] * i[j+1]
    print(decr_data)
    with open('decrypted_data.txt', 'w') as file:
        file.write(decr_data)


rle_decrypt('crypted_data.txt')