// Задание 1
// Создать переменные num1, num2 которые пользователь вводит с клавиатуры
// Проверьте, что переменная num1 равна или меньше 1, а переменная num2 больше или равна 3.


// let num1 = +prompt ("Введите ПЕРВОЕ число ");
// let num2 = +prompt ("Введите ВТОРОЕ число ");

// if (num1 <= 1) {
//     console.log ("ПЕРВОЕ число равно или меньше 1");
// }   else {
//     console.log ("ПЕРВОЕ число больше 1");
// }
// if (num2 >= 3) {
//     console.log ("ВТОРОЕ число больше или равно 3");
// }   else {
//     console.log ("ВТОРОЕ число меньше 3");
// }


// Задание 2
// Перепишите код к тернарному оператору
// let test = true;
// if (test === true) {
// console.log('+++');
// } else {
// console.log('---');
// }

// let test = true;
// console.log(test? "999+++" : "666---")



// Задание 3
// В переменной day лежит какое-то число из интервала от 1 до 31. Определите в какую декаду месяца попадает это число (в первую, вторую или третью).

let day = Number(prompt("Введите число из интервала от 1 до 31 и программа сообщит вам в какую ДЕКАДУ месяца попадает это число "));

if (day >= 1 && day <= 10) {
    alert(`число ${day} попадает в ПЕРВУЮ декаду месяца`);
}
else if (day >= 11 && day <= 20) {
    alert(`число ${day} попадает во ВТОРУЮ декаду месяца`);
}
else if (day >= 12 && day <= 31) {
    alert(`число ${day} попадает в ТРЕТЬЮ декаду месяца`);
}
else {
    alert(`Вы ввели число ${day} меньше 1 или больше 31`);
}


