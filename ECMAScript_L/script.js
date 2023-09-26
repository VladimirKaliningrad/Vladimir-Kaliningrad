// Создайте функцию mergeArrays, которая принимает два массива и возвращает новый массив, содержащий все элементы из обоих массивов. Используйте spread оператор для объединения массивов.
// mergeArrays([1, 2, 3], [4, 5, 6]); // Ожидаемый результат: [1, 2, 3, 4, 5, 6]

function mergeArrays(arr1, arr2) {
    const result = [...arr1, ...arr2];
    return result;
}
console.log(mergeArrays([2, 4, 5], [3, 7, 8]));
/////////2 вариант////////////
const mergeArrays2 = (arr1, arr2) => [...arr1, ...arr2];
console.log(mergeArrays2([1, 2, 3], [4, 5, 6]));

////////////////////////////////////////////////////////////////////////
// Создайте функцию removeDuplicates, которая принимает любое количество аргументов и возвращает новый массив, содержащий только уникальные значения. Используйте rest оператор для сбора всех аргументов в массив а затем filter для определения дубликатов.
// removeDuplicates(1, 2, 3, 2, 4, 1, 5); // Ожидаемый результат: [1, 2, 3, 4, 5]

function removeDuplicates(...arguments) {
    return arguments.filter((value, index) => arguments.indexOf(value) === index);
}

console.log(removeDuplicates(10, 1, 10, 4, 5, 3, 4, 5, 6, 6, 7, 6, 6, 5, 4, 4, 3, 10));
//////////////////////////////////////////////////////////////////

// Напишите функцию getEvenNumbers, которая принимает массив чисел в качестве аргумента и возвращает новый массив, содержащий только четные числа.

const getEvenNumbers = (params) => params.filter((params) => params % 2 === 0);
console.log(getEvenNumbers([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]));

// Напишите функцию calculateAverage, которая принимает массив чисел в качестве аргумента и возвращает среднее значение этих чисел.

const calculateAverage = (params) => params.reduce((acc, num) => acc + num, 0) / params.length;
console.log(calculateAverage([1, 30, 24, 56, 89]));

// Напишите функцию capitalizeFirstLetter, которая принимает строку в качестве аргумента и возвращает новую строку, в которой первая буква каждого слова является заглавной.
const capitalizeFirstLetter = (params) => {
    return params.split(' ').map(word => word.charAt(0).toUpperCase() + word.slice(1)).join(' ');
}
console.log(capitalizeFirstLetter('text hello world'));

////////////////////////////////////////////////////////////////////////////////

// Напишите функцию createCalculator, которая принимает начальное значение и возвращает объект с двумя методами: add и subtract. Метод add должен увеличивать значение на переданное число, а метод subtract должен уменьшать значение на переданное число. Значение должно быть доступно только через методы объекта, а не напрямую.


function createCalculator(num) {
    let value = num;
    return {
    add: (num) => { value += num },
    subtract: (num) => { value -= num },
    result: () => value
    }
    }
    const calc = createCalculator(3)
    calc.add(10);
    console.log(calc.result());
    calc.subtract(3);
    console.log(calc.result());

///////////////////////////////////////////////////////////////////////////
// Напишите функцию createGreeting, которая принимает имя пользователя и возвращает функцию, которая будет выводить приветствие с использованием этого имени.
// // Пример использования:
// const greeting = createGreeting('John');
// greeting(); // Ожидаемый результат: "Hello, John!"

function createGreeting(name) {
    return function() {console.log('Hello, ' + name)};
}
const greeting = createGreeting ('Vladimir');
greeting();

/////////////////////////////////////////////////////////////////////////////
// Напишите функцию createPasswordChecker, которая принимает допустимую длину пароля в качестве аргумента и возвращает функцию для проверки введенного пароля. Возвращаемая функция должна принимать пароль и возвращать true, если его длина соответствует допустимой, и false в противном случае.
// // Пример использования:
// const isPasswordValid = createPasswordChecker(8);
// console.log(isPasswordValid('password')); // Ожидаемый результат: false
// console.log(isPasswordValid('secret')); // Ожидаемый результат: true


const createPasswordChecker = (num) => {
    return (password) => (password.length <= num);
    }
    const passw = createPasswordChecker(5);
    console.log(passw('12345'));