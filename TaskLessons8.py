###   УЛУЧШЕНИЕ КОДОВ ЗАДАЧ   #########
######################################################

#####АБВ программа###################################

# text = list(map(str, input('Введите строку: ').split()))
# text = filter(lambda x: 'абв' not in x, text)

# for i in text:
#     print(i, end=' ')

# ####################################################
# #######     ################################
# lis1 = [1.1,2.2,3.001,4.4]
# lis2 = [round(lis1[n] - round(lis1[n]),10) for n in range(0,len(lis1))]
# print('Задание 2: ', max(lis2)-min(lis2))

###############################################
#####
# numbers = [2, 3, 4, 5, 6, 7, 5]
# diff = list([a*b for a, b in zip(numbers, numbers[:(len(numbers)//2) - 1: -1])])
# print(diff)
#######################################
#####   ВЫБОРКА   ########
def find_employees_by_salary_range(employees: list) -> list:
    result = []
    lo, hi = get_salary_range()
    for employee in employees:
        if lo <= employee["salary"] <= hi:
            result.append(employee)
    return result

