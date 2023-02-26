from controller import Controller
from commands import *


class View:

    def __init__(self, controller: Controller):
        self.controller = controller

    def validate_input(self,input_string: str):
        if not input_string.isdigit():
            return input('Only numbers allowed. Enter ID:\n')
        else:
            return input_string

    def validate_id(self, id: int) -> bool:
        notes_list = self.controller.read_notebook()
        id_list = [note.get_id() for note in notes_list]
        if id not in id_list:
            return False
        else:
            return True

    def print_note(self,note):
        print(f'ID: {note.get_id()} Title: {note.get_title()} Content: {note.get_content()} Date: {note.get_date()}')

    def print_notes_list(self, notes_list):
        for note in notes_list:
            print(
                f'ID: {note.get_id()} Title: {note.get_title()} Content: {note.get_content()} Date: {note.get_date()}')

    def run(self):
        while True:
            try:
                command = input(commands).lower().strip()
                match command:
                    case 'show':
                        notes = self.controller.read_notebook()
                        self.print_notes_list(notes)
                        continue
                    case 'create':
                        title = input('Enter title: ')
                        content = input('Enter content: ')
                        self.controller.create_note(title, content)
                        print(f'Note was successfully created\n')
                        continue
                    case 'update':
                        id = int(self.validate_input(input('Enter ID: ')))
                        if self.validate_id(id):
                            new_title = input('Enter new title: ')
                            new_content = input('Enter new content: ')
                            self.controller.update_note(id, new_title, new_content)
                            print(f'Note with ID: {id} was successfully updated\n')
                            continue
                        else:
                            print('No such ID\n')
                            continue
                    case 'delete':
                        id = int(self.validate_input(input('Enter ID: ')))
                        if self.validate_id(id):
                            self.controller.delete_note(id)
                            print(f'Note with ID: {id} was successfully deleted\n')
                            continue
                        else:
                            print('No such ID\n')
                            continue
                    case 'find':
                        id = int(self.validate_input(input('Enter ID: ')))
                        if self.validate_id(id):
                            note = self.controller.find_by_id(id)
                            self.print_note(note)
                            continue
                        else:
                            print('No such ID\n')
                            continue
                    case 'filter':
                        date = input('Enter date (format: YYYY-MM-DD or YYYY-MM or YYYY)\n')
                        result = self.controller.filter_by_date(date)
                        if len(result) == 0:
                            print('Nothing was found\n')
                            continue
                        else:
                            self.print_notes_list(result)
                            continue
                    case 'exit':
                        break
                    case _:
                        print('Wrong command. Try again.\n')
            except Exception:
                print('You did something wrong. Try again.')
                continue
