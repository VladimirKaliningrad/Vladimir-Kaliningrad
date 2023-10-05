// Создайте функцию delayedMessage(message, delay), которая принимает аргументы message (строка) и delay (число). Функция должна выводить заданное сообщение в консоль через указанную задержку.
// Вызовите функцию delayedMessage() три раза с разными сообщениями и задержками. Например:
// delayedMessage("Сообщение 1", 2000)
// delayedMessage("Сообщение 2", 1000)
// delayedMessage("Сообщение 3", 3000)
// После вызова всех функций delayedMessage(), добавьте сообщение вида "Конец программы" с помощью console.log().

// function delayedMessage(message, delay) {
//     setTimeout (() => console.log(message), delay);
// }

// delayedMessage("Сообщение 1", 2000)
// delayedMessage("Сообщение 2", 1000)
// delayedMessage("Сообщение 3", 3000)

///////////////////////////////////////////////////////////////////////////

// У вас есть список задач, которые необходимо выполнить в определенном порядке. Каждая задача должна быть выполнена через определенный промежуток времени, заданный в миллисекундах. Вам необходимо написать функцию, которая принимает список задач и интервал времени, а затем выполняет каждую задачу через определенный промежуток времени.

// const tasks = [
// { name: 'task 1', time: 1000 },
// { name: 'task 2', time: 2000 },
// { name: 'task 3', time: 3000 },
// { name: 'task 4', time: 4000 },
// { name: 'task 5', time: 5000 }
// ];

// const tasks = [
//     {name: 'task 1', time: 1000},
//     {name: 'task 2', time: 2000},
//     {name: 'task 3', time: 3000},
//     {name: 'task 4', time: 4000},
//     {name: 'task 5', time: 5000},
//     {name: 'task 6', time: 7000}
// ];

// function taskSheduler (task, delay) {
//     setTimeout(() => console.log(task), delay);
// };

// tasks.forEach (element => {
//     taskSheduler (element.name, element.time)
// });

// ////////////////////////////////////////////////////////////////////////////////
// Напишите программу, которая загружает данные с сервера с использованием объекта XMLHttpRequest
// Создайте функцию loadData(url), которая принимает аргумент url (строка) - адрес сервера для загрузки данных.
// Внутри функции loadData() создайте объект XMLHttpRequest с помощью new XMLHttpRequest().
// Зарегистрируйте обработчик события onreadystatechange, который будет вызываться при изменении состояния запроса. Проверьте, если успешно выполнен запрос и успешный статус ответа сервера, то выведите полученные данные в консоль с помощью console.log(xhr.responseText).
// Откройте запрос с помощью xhr.open("GET", url, true).
// Отправьте запрос на сервер.


// function loadData(url) {
//     const xhr = new XMLHttpRequest();
    
//     xhr.onreadystatechange = function () {
//     if (xhr.status !== 200) { // если статус не 200, то произошла ошибка
//     console.log(`Error ${xhr.status}: ${xhr.statusText}`);
//     } else {
//     console.log(`user: ${xhr.responseText}`); // response - это ответ сервера
//     }
//     };
//     xhr.open('GET', url, true);
//     xhr.send();
//     };
    
//     loadData('https://jsonplaceholder.typicode.com/users')


////////////////////////////////////////////////////////////////////////////////////

    // Вы разрабатываете простой веб-интерфейс для отображения списка пользователей с сервера и возможности сортировки этих пользователей по имени. У вас уже есть функциональность для получения списка пользователей с сервера и отображения их в виде списка на странице.

    // fetch('https://jsonplaceholder.typicode.com/users')
    // .then((response) => response.json())
    // .then((elem) => listUser(elem));
    // const userListC = document.querySelector('.userList')
    // function listUser(elem) {
    // userArr = [];
    // for (let i = 0; i < elem.length; i++) {
    // userArr.push(elem[i].name);
    // userListC.innerHTML += elem[i].name + '<br>';
    // };
    
    // userArr = userArr.sort();
    // userListC.innerHTML += '<br>';
    
    // for (let i = 0; i < userArr.length; i++) {
    // userListC.innerHTML += userArr[i] + '<br>';
    
    // }
    
    // };


