
def save_data(data, src):
    with open(src, "w", encoding="utf-8") as file:
        file.write(convert_data(data, ";"))
    with open("dataBase.txt", "w", encoding="utf-8") as file:
        file.write(convert_data(data, "::")) 

def convert_data (data, separator):  
    result = " "
    for i in data:
        result += separator.join (i.values())
    return result             