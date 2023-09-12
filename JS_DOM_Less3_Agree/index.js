
// const checkbox = document.querySelector("#agree");
// const submitBtn = document.querySelector("#submit");
// const body = document.querySelector("body");

// submitBtn.addEventListener("click", function () {
//     const div = document.createElement ("div");
//     if (!checkbox.checked) {
//         div.textContent = "Необходимо согласиться с условием"
//         div.style.color = "red"
//     } else {
//         div.textContent = "Согласились"
//         div.style.color = "green"
//     }
//     body.appendChild(div);
// });

// /////////////////////////////////////////////////////////////////////////////

// const teaBtn = document.querySelector("input[value='tea']");
// const coffeeBtn = document.querySelector("input[value='coffee']");
// const submitBtn = document.querySelector("#submit");

// submitBtn.addEventListener("click", ()=> {
//     if(teaBtn.checked) {
//         alert ("Чай закончился");
//     } else if (coffeeBtn.checked) {
//             alert("Кофе закончился");
//         }
    
// });

///////////////////////////////////////////////////////////////////////////////


// const passwordField = document.querySelector("#password-field");
// const submitButton = document.querySelector("#submit-button");
// const form = document.querySelector("form");
// const togglePasswordBtn = document.querySelector("#togglePassword");
// togglePasswordBtn.style.display = "none";
// form.style.margin = "150px";

// form.addEventListener("submit", (event) => {
// event.preventDefault();
// if (passwordField.value === "пароль") {
// passwordField.style.borderColor = "green";
// passwordField.style.borderWidth = "3px";
// // проходим к дальнейшим действиям
// } else {
// passwordField.style.borderColor = "red";
// passwordField.style.borderWidth = "3px";

// passwordField.setCustomValidity("Пароль неверный");
// passwordField.reportValidity();
// }
// });

// passwordField.addEventListener("input", () => {
// passwordField.setCustomValidity("");
// });

// passwordField.addEventListener("input", () => {
// if (passwordField.value === "") {
// togglePasswordBtn.style.display = "none";
// } else {
// togglePasswordBtn.style.display = "inline-block";
// }
// });

// togglePasswordBtn.addEventListener("click", (event) => {
// event.preventDefault();
// const type =
// passwordField.getAttribute("type") === "password" ? "text" : "password";
// passwordField.setAttribute("type", type);
// togglePasswordBtn.textContent =
// type === "password" ? "покажи пароль" : "скрыть пароль";
// });

///////////////////////////////////////////////////////////////////////////////

const chageHeader = () => {
    const input = document.querySelector("input");
    const header = document.querySelector("h1");
    header.innerText = input.value;
    };
    
    input.addEventListener("input", chageHeader);
    