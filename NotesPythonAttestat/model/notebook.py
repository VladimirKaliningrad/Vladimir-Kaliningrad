import datetime

from model.note import Note


class Notebook:

    def read_notes(self) -> [Note]:
        lines: [Note] = []
        file = open('notes.csv', 'r')
        for line in file:
            if not line:
                continue
            else:
                note_parts = line.strip('\n').split(';')
                lines.append(Note(int(note_parts[0]), note_parts[1], note_parts[2], note_parts[3]))
        file.close()
        return lines

    def write_notes(self, notes_list: [Note]):
        file = open('notes.csv', 'w')
        for note in notes_list:
            file.write(f'{str(note.get_id())};{note.get_title()};{note.get_content()};{note.get_date()}\n')
        file.close()

    def make_id(self) -> int:
        notes_list = self.read_notes()
        max_id = 0
        for note in notes_list:
            if note.get_id() > max_id: max_id = note.get_id()
        return max_id + 1

    def create_note(self, title: str, content: str):
        notes_list = self.read_notes()
        new_note = Note(self.make_id(), title, content, str(datetime.datetime.now()))
        notes_list.append(new_note)
        self.write_notes(notes_list)

    def update_note(self, id: int, new_title: str, new_content: str):
        notes_list = self.read_notes()
        for note in notes_list:
            if note.get_id() == id:
                note.set_new_title(new_title)
                note.set_new_content(new_content)
                note.set_new_date()
        self.write_notes(notes_list)

    def delete_note(self, id: int):
        notes_list = self.read_notes()
        for note in notes_list:
            if note.get_id() == id:
                notes_list.remove(note)
        self.write_notes(notes_list)

    def find_by_id(self, id: int) -> Note:
        notes_list = self.read_notes()
        for note in notes_list:
            if note.get_id() == id:
                return note

    def filter_by_date(self, date: str) -> [Note]:
        notes_list = self.read_notes()
        result = []
        for note in notes_list:
            if date in note.get_date():
                result.append(note)
        return result

