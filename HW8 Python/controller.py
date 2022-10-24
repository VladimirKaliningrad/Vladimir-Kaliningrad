import view
import model

def run_database():
    choice = view.main_menu()
    if choice == 1:
        model.find_employee(view.get_last_name())
        run_database()
    elif choice == 2:
        model.job_selection(view.get_employee_position())
        run_database()
    elif choice == 3:
        model.sample_by_salary(view.get_salary_range())
        run_database()
    elif choice == 4:
        model.add_employee()
        run_database()
    elif choice == 5:
        model.delete_employee(view.get_id())
        run_database()
    elif choice == 6:
        model.update_employee(view.get_id())
        run_database()
    elif choice == 7:
        model.export_json()
        run_database()
    elif choice == 8:
        model.stop_programm()
        