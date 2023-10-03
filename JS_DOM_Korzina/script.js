async function fetchData() {
    try {
        const responce = await fetch('data.json');
        if (!responce.ok) {
            throw new Error("Не удалось получить данные от data")
        }
        const data = await responce.json();

        const productBox = document.querySelector('.product-box');
        data.forEach(({ image, name, description, price }) => {
            const product = `
            <div class="product">
                <img class="product__img" src="${image}" alt="photoproduct">
                <div class="product__content">
                    <h1 class="product__title">${name}</h1>
                    <p class="product__text">${description}</p>
                    <p class="product__price">${price}</p>
                </div>
                <div class="product__addtocart">
                    <img src="img/bin.svg" alt="">
                    <p>Add to Cart</p>
                </div>
            </div>
            `;
            productBox.insertAdjacentHTML('beforeend', product);
        })

    } catch (error) {
        console.error(error);
    }

    async function cartData() {
        try {
            const responce = await fetch('data.json');
            if (!responce.ok) {
                throw new Error("Не удалось получить данные от data")
            }
            const data = await responce.json();

            const cartBox = document.querySelector('.cart-box');
            data.forEach(({ name, image, price, color, size, quantity }) => {
                const cart = `
            <div class="cart">
            <button class="cart__btndel"></button>
            <div class="cart__content">
                <img class="cart__img" src="${image}" alt="${name}">
                <div class="cart__desc">
                    <h2 class="cart__name">${name}</h2>
                    <p class="cart__price-label">Price: <span class="cart__price">${price}</span></p>
                    <p class="cart__color">Color: ${color}</p>
                    <p class="cart__sise">Size: ${size}</p>
                    <div class="cart__dty">
                        <label class="cart__input-label">Quantity: </label>
                        <input type="text" class="cart__input-quantity" value = "${quantity}">
                    </div>
                </div>
            </div>
        </div>`;
                cartBox.insertAdjacentHTML('beforeend', cart);
            })

            const btns = document.querySelectorAll('.cart__btndel');
            btns.forEach((el) => {
                el.addEventListener('click', () => {
                    const cart = el.closest(".cart");
                    cart.remove();
                })
            })
        } catch (error) {
            console.error(error);
        }
    }

    const addToCart = document.querySelectorAll('.product__addtocart');
    addToCart.forEach((el) => {
        el.addEventListener('click', () => {
            cartData();
        })
    })
}
fetchData();