document.querySelector("#add").addEventListener("click", addListItem);

document
.querySelector("#remove")
.addEventListener("click", removeFirstListItem);

document.querySelector("#addClass").addEventListener("click", addClickClass);

function addListItem() {
const list = document.querySelector("#list");
const newItem = document.createElement("li");
newItem.textContent = "Новый элемент";
list.appendChild(newItem);
}

function removeFirstListItem() {
const list = document.querySelector("#list");
if (list.firstElementChild) {
list.firstElementChild.remove();
}
}

function addClickClass() {
this.classList.add("click");
}