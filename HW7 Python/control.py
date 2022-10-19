import model as m
import view as v

def run_phonebook():
    choice = v.show_menu()
    if choice == 1:
        v.show_phonebook()
    elif choice == 2:
        m.find_by_surname()
    elif choice == 3:
        m.find_by_phonenumber()
    elif choice == 4:
        m.add_contact()
    elif choice == 5:
        filename = v.get_filename()
        if '.txt' in filename:
            m.add_contact_by_txt(filename)
        elif '.csv' in filename:
            m.add_contact_by_csv(filename)
    elif choice == 6:
        m.export_to_txt()
    elif choice == 7:
        m.stop_phonebook()