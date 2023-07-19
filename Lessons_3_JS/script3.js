// const task1 = () => {

// let age = prompt("Напишите ваш возраст");
// alert(`Пользователю ${age} лет`);
// let name = prompt("Как Вас зовут?");
// alert(`Добро пожаловать на сайт, ${name}`);




// let userAge = Number(prompt("Ваш возраст"));
// if (userAge <= 0) {
//     alert("Вы ввели не верное значение")
// } else if (userAge === 1) {
//     alert(`Вам ${userAge} год`)
// }
// else if (userAge >= 2 && userAge <= 4) {
//     alert(`Вам ${userAge} года`)
// }
// else {
//     alert (`Вам ${userAge} лет`);
// }




// }

// task1();


// let a = "2";
// let b = "3";
// console.log(a + b);
// if (typeof (Number(a))==typeof (Number (b)) == "number") console.log (Number(a) + Number(b));


// let num1 = Number(prompt("Введите первое число: "));
// let num2 = Number(prompt("Введите второе число: "));

// console.log(`
// Сумма чисел = ${(num1 + num2)}
// Разность чисел = ${(num1 - num2)}
// Произведение чисел = ${num1 * num2}
// Частное чисел = ${(num1 / num2)}
// Остаток от деления чисел = ${(num1 % num2)} 
// `);


let a = +prompt("Введите число а ");
if (a > 5) {
    console.log("Число больше 5");
}
else if (a < 5) {
    console.log("Число меньше 5");
} else {
    console.log("Число равно 5");
}


let test1 = +prompt("Введите число а");
let test2 = +prompt("Введите число b");

if (test1 === test2) {
    console.log("Значение равны");
} else {
    console.log("Значения не равны");
} if (test1 < test2) {
    console.log("Первое число меньше");
} else {
    console.log("Второе число меньше")
};

if (test1 > 0 && test2 < 15) {
    console.log("Первое число больше 0 и меньше 15");
} else {
    console.log("Первое число меньше 0 или больше 15")
}
