# Напишите программу для. проверки истинности утверждения ¬(X ⋁ Y ⋁ Z) = ¬X ⋀ ¬Y ⋀ ¬Z для всех значений предикат.

x = input('X = ')
y = input('Y = ')
z = input('Z = ')
first = not (x or y or z)
second = (not x) and (not y) and (not z)
print(first == second)