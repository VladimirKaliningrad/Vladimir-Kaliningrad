import read
import Record
import view

data = read.get_data("dataBase.csv",";")

# def last_id():
#     id_list = [int(i["id"]) for i in data if i["id"].isdigit()]
#     return str(max(id_list) + 1)

def what_contact(what_find):
    data_to_print = [i for i in data if what_find in i.values()]
    # print(data_to_print)
    return data_to_print
 
def main_logic():
    value = 0
    while value != 4:
        value = view.user_command()
        if value == 1:
            what_find = view.find_contact()
            view.print_all_contacts(what_contact(what_find))
        elif value == 2:
            contact = view.create_contact()
            contact["id"] ="XXX"

            #contact["id"] = last_id()
            data.append(contact)
            Record.save_data(data,"dataBase.csv")
            
        elif value == 3:
            view.print_all_contacts(data)
        elif value == 4:
            print('Bye - bye! =)')
            break
        print("Вы выбрали {}-й пункт".format(value))



    