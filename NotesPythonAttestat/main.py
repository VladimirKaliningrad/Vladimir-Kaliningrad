from model.notebook import Notebook
from controller import Controller
from view import View


notebook = Notebook()
controller = Controller(notebook)
view = View(controller)
view.run()