//task1

// function sayHelloName(firstName, secondName, age) {
//     console.log(`Привет ${firstName} ${secondName} с возрастом ${age}`);
// }
// sayHelloName('Владимир', 'Январь', 40);


// function squared (num) {
//     return num ** 2;
// }

// console.log(squared (5));

// const secondSquared = (num) => num **2;
// console.log(secondSquared (3));


// let num = -5;
// (num>= 0) ? console.log('+++') : console.log('---');

// function plusMinus (num) {
//     console.log ((num>=0) ? '+++' : '---');
// }
// plusMinus (2);


// const sum1 = (num1, num2, num3) => num1 + num2 + num3;
// console.log(sum1 (1,5,5));


// function sum (number1 = 3, number2 = 4) {
//     return Math.sqrt (number1) + Math.sqrt (number2);
// }
// alert (sum());
// alert (sum(4, 9));


// let num1 = Number(prompt ('Введите первое число'));
// let num2 = Number(prompt ('Введите второе число'));

// const minNumber = (num1, num2) => (num1 < num2) ? num1 : num2;
// alert (`${minNumber(num1, num2)} -минимальное число`);


// let day = +prompt('Введите число от 1 до 7(дни недели)');

// function week(day) {
//     switch(day){
//         case 1:
//             alert('понедельник');
//             break;
//         case 2:
//             alert('вторник');
//             break;
//         case 3:
//             alert('среда');
//             break;
//         case 4:
//             alert('четверг');
//             break;
//         case 5:
//             alert('пятница');
//             break;
//         case 6: 
//             alert('суббота');
//             break; 
//         case 7:
//             alert('воскресенье');
//             break;
//         default:
//             alert('нет такого числа в недели');                           
//     }
// }
// week (day);


function getGoodDay(name, hourDay) {
    if (hourDay >= 6 && hourDay < 10) {
        alert(`Доброе утро ${name}`);
    } else if (hourDay >= 10 && hourDay < 18) {
        alert(`Добрый день ${name}`);
    } else if (hourDay >= 18 && hourDay < 21) {
        alert(`Добрый вечер ${name}`);
    } else if (hourDay >= 21 && hourDay <= 23) {
        alert(`Доброй ночи ${name}`);
    } else if (hourDay >= 0 && hourDay < 6) {
        alert(`Доброй ночи ${name}`);
    }
}
let date = new Date();
console.log(getGoodDay('Владимир', date.getHours()));

