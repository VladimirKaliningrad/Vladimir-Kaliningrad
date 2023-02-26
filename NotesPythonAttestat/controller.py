from model.notebook import Notebook
from model.note import Note


class Controller:

    def __init__(self, notebook: Notebook):
        self.notebook = notebook

    def read_notebook(self) -> [Note]:
        notes = self.notebook.read_notes()
        return notes

    def create_note(self, title: str, content: str):
        self.notebook.create_note(title, content)

    def update_note(self, id: int, new_title: str, new_content: str):
        self.notebook.update_note(id, new_title, new_content)

    def delete_note(self, id: int):
        self.notebook.delete_note(id)

    def find_by_id(self, id: int) -> Note:
        return self.notebook.find_by_id(id)

    def filter_by_date(self, date: str) -> [Note]:
        return self.notebook.filter_by_date(date)