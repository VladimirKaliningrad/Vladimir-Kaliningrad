# Напишите программу, которая найдет произведение пар чисел списка.
# Парой считаем первый и последний элемент, второй и предпоследний и т.д.
# Пример:
# [2, 3, 5, 6] => [12, 15]

# from random import randint


# nums = []
# for i in range(randint(4, 8)):
#     nums.append(randint(5, 11))

# result = []
# for i in range((len(nums) // 2 + 1)):
#     result.append(nums[i] * nums[-i - 1])
# print(nums, result, sep=' -> ')

from random import randint


nums = [randint(5, 11) for i in range(randint(4, 8))]
result = [nums[i] * nums[-i - 1] for i in range((len(nums) // 2 + 1))]
print(nums, result, sep=' -> ')