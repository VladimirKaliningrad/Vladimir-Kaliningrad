
def user_command():
    num = int(input("Input \n 1.If You want to find a contact: \n 2. If You want to create a new contact: \n 3. If You want to see all contacts : \n 4. If You want to close the programm: "))
    if 0 < num < 5:
        return num
    else:
        print("Incorrect number! The programm will be closed.")
        return 4

## print(user_command())


def find_contact():
    find_me = input('Input contacts firstname or lastname or middlename: ')
    return find_me


def create_contact():
    new_contact = {"id":""}
    new_contact['secondname'] = input ('input Secondname or press "enter" in case if you do not want to add it: ')
    new_contact['name'] = input('Input Firstname: ')
    while new_contact['name'] =='':
        new_contact['name']=input('Input Firstname')
    new_contact['lastname']= input('Input Lastname or press "enter" in case if you do not want to add it: ')    
    new_contact['phone_number'] = input('Input phone number: ')
    new_contact['comment'] = input ('Leave a comment here or press "enter" in case if you do not need it: ') + "\n"

    print(new_contact)
    return new_contact

    # print(create_contact())

    from tabulate import tabulate  ### Таблица для вывода всех контактов

def print_all_contacts(data):
    data_to_print = []
