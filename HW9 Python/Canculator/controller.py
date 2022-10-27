import model
import view

def run_programm():
    operation = view.get_operation()
    if operation != 'exit':
        try:
            result = model.calculate(operation)
            view.show_result(operation, result)
            run_programm()
        except (ValueError, ZeroDivisionError, IndexError):
            view.show_error_message()
            run_programm()
    else:
        model.stop_calc()