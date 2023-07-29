// Task1
// const array = [1, 2, 3, 4];
// for (i = 0; i < array.length; i++) {
//     console.log(array[i]);
// }

// const arrayNew = [
//     'qwewqer',
//     'rteegg',
//     'egergergre',
//     'wefwfwef',
//     'wefwvgwgreger'
// ]
// console.log(arrayNew.length);



// const array3 = [
//     'a',
//     'b',
//     'c'
// ]
// array3[0] = 1;
// array3[1] = 2;
// array3[2] = 3;
// for (i = 0; i < array3.length; i++) {
//     console.log(array3[i]);
// }

// const array4 = [1, 2, 3];
// for (let i = 0; i < array4.length; i++) {
//     array4[i]++;
// }
// console.log(array4);

// const array5 = [1, 2, 3, 4, 5, 6, 7, 8, 9];
// array5[3] = 'a';
// array5[8] = 'b';
// console.log(array5);

// const array6 = [1, 2, 3];
// array6.push(4, 5);
// console.log(array6);

// const array7 = [1, 2, 3, 4, 5, 6, 7, 8];
// array7.pop();
// array7.pop();
// console.log(array7);

// С помощью цикла for выведите в консоль числа от 11 до 33.
// С помощью цикла for выведите в консоль нечетные числа в промежутке от 1 до 99.
// С помощью цикла for выведите в консоль числа от 100 до 0.
// Дано число num с неким начальным значением. Умножайте его на 3 столько раз, пока результат умножения не станет больше 1000. Какое число получится? Посчитайте количество итераций, необходимых для этого.

// for (let i =11; i <=33; i++) {
//     console.log(i);
// }

// for (let i =1; i < 100; i++){
//     if (i % 2 !==0)
//     console.log(i);
// }

// for (let i =100; i >=0; console.log(i--)){
// }

// let x=0;
// let num =1;
// while (num <= 1000) {
//     num *= 3;
//     x++;
// }
// console.log(num);
// console.log(x);


// Дан массив const arr = [2, 5, 9, 15, 1, 4];
// Выведите в консоль те элементы массива, которые больше 3-х, но меньше 10.
// Найдите сумму четных чисел от 2 до 100.
// Дан массив const = [2, 5, 9, 3, 1, 4];
// Найдите сумму элементов этого массива.
// С помощью цикла сформируйте строку '-1-2-3-4-5-6-7-8-9-'.



// const array8 = [2,5,9,15,1,4];
// for(let i = 0; i <array8.length; i++) {
//     if (array8 [i] > 3 && array8 [i] < 10) {
//         console.log(array8[i]);
//     }
// }
// console.log('----------------------');


// const sumNumbers = (num1, num2) => {
//     let sum =0;
//     for (let i =num1; i <= num2; i++) {
//         if (i % 2 ===0) {
//             sum +=i;
//         }
//     }
//     return sum;
// }   
// console.log (sumNumbers (2,100));
// console.log ('-------------------');


// const array9 = [2,5,9,3,1,4];
// let sum =0;
// for (let i =0; i < array9.length; i++) {
//     sum += array9 [i];
// }
// console.log (`Сумма элементов массива = ${sum}`);
// console.log ('-----------------');


// let str = '-';
// for (let i =1; i <= 9; i++) {
//     str += i + '-';
// }
// console.log (str);
// console.log ('-------------------')


// Дан массив с числами [2, 5, 9, 0, 3, 1, 4]; Запустите цикл, который будет по очереди выводить элементы этого массива в консоль до тех пор, пока не встретится элемент со значением 0. После этого цикл должен завершить свою работу.

// const array10 = [2,5,9,0,3,1,4];
// for (let i =0; i < array10.length; i++) {
//     if (array10 [i] !== 0) {
//         console.log (array10 [i]);
//     } else {
//         break;
//     }
// }

// Пусть у нас дан массив состоящий из 10 элементов с произвольными числами. Давайте переберем его циклом и числа, которые делятся на 2, возведем в квадрат и выведем в консоль, а числа, которые делятся на 3, возведем в куб и выведем в консоль.
// С помощью двух вложенных циклов выведите на экран следующую строку:[
// [1, 2, 3],
// [4, 5, 6] ]
// Дан массив const arr = [1, 2, 3, 2, 4, 3, 5, 6, 3, 2, 3];
// Подсчитайте количество цифр 3 в этом массиве.
// Дан следующий массив:
// [1, 2, 3, 4, 5]
// С помощью метода splice преобразуйте массив в следующий:
// [1, 4, 5]

let Array5 = 10;
const myNewArray5 = [];
const randomArray5 = () => {
    return Math.ceil(Math.random() * (20 - 0) + 1);
}
i = 0;
while (Array5 !== i) {
    myNewArray5[i] = randomArray5();
    i++;
}

for (i = 0; i < myNewArray5.length; i++) {
    console.log("Началное " + myNewArray5[i]);
    if (myNewArray5[i] % 2 === 0) {
        console.log("Квадрат " + myNewArray5[i] ** 2);
    }
    if (myNewArray5[i] % 3 === 0) {
        console.log("Куб " + myNewArray5[i] ** 3);
    }
}

const dualMass1 = [];
for (i = 0; i < 2; i++) {
    const dualMass2 = [];
    for (j = 1; j <= 3; j++) {
        if (i === 1) {
            dualMass2[j] = j + 3;
        } else {
            dualMass2[j] = j;
        }
    }
    dualMass1.push(dualMass2);
}
console.log(dualMass1);

const arr5 = [1, 2, 3, 2, 4, 3, 5, 6, 3, 2, 3];
let counte = 0;
for (i = 0; i < arr5.length; i++) {
    if (arr5[i] === 3) {
        counte++;
    }
}
console.log(counte);

const massNew1 = [1, 2, 3, 4, 5];
massNew1.splice(1, 2);
console.log(massNew1);