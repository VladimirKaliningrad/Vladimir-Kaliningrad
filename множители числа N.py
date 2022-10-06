# Задайте натуральное число N. Напишите программу, 
# которая составит список простых множителей числа N.

n = int(input('Введите N '))
primes = list(range(n+1))
primes[1] = 0
i = 2
while i < n / 2:
    if primes[i] != 0:
        j = i**2
        while j <= n:
            primes[j] = 0
            j += i
    i += 1
primes = [i for i in primes if i != 0]

if n in primes:
    print(f'{n} - простое число')
else:
    i = 0
    res = []
    while n > 1:
        if n % primes[i] == 0:
            res.append(primes[i])
            n /= primes[i]
        else:
            i += 1
    print(res)