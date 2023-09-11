const buttonsData = [
    { id: "add", text: "Добавить заголовок", clickHandler: addHeding },
    { id: "remove", text: "Удалить заголовок", clickHandler: removeHeading },
    {
    id: "hover",
    text: "Кнопка с наведением",
    mouseoverHandler: handleHoverIn,
    mouseoutHandler: handleHoverOut,
    },
    ];
    
    function addHeding() {
    const heading = document.createElement("h1");
    heading.textContent = "Новый заголовок";
    document.body.appendChild(heading);
    }
    
    function removeHeading() {
    const heading = document.querySelector("h1");
    if (heading) {
    heading.remove();
    }
    }
    
    function handleHoverIn() {
    console.log("Вы навели на данную кнопку");
    }
    
    function handleHoverOut() {
    console.log("Вы вы ушли от кнопки");
    }
    
    function createButtons() {
    const btnContainer = document.querySelector("div");
    
    buttonsData.forEach((el) => {
    const btn = document.createElement("button");
    btn.id = el.id;
    btn.textContent = el.text;
    btnContainer.appendChild(btn);
    
    if (el.clickHandler) {
    btn.onclick = el.clickHandler;
    }
    
    if (el.mouseoverHandler) {
    btn.onmouseover = el.mouseoverHandler;
    }
    
    if (el.mouseoutHandler) {
    btn.onmouseout = el.mouseoutHandler;
    }
    });
    }
    createButtons();