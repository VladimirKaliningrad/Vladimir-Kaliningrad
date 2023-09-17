async function fetchData () {
    try {
        const response = await fetch ('data.json');
        console.log(response);
        if (!response.ok) {
            throw new Error('Не удалось получить данные с data JSON')
        }
        const data = await response.json()
        console.log(data);
        const productBox = document.querySelector('.product_box');

        data.forEach(({name, image, price, color, size, quantity}) => {
            const productEl = `
            <div class="product">
            <button class="btn_del"></button>
            <div class="content">
                <img class="product_img" src="${image}" alt="${name}">
                <div class="product_desc">
                    <h2 class="product_name">${name}</h2>
                    <p class="product_price_label">Price: <span class="product_price">$${price}</span></p>
                    <p class="product_color">Color:${color}</p>
                    <p class="product_size">Size:${size}</p>
                    <div class="product_qty">
                       <label class="input_label">Quantity:</label>   
                       <input type="text" class="input_quantity" value = "${quantity}"/>
                    </div>


                </div>
            </div>
        </div>`;
        productBox.insertAdjacentHTML('beforeend', productEl)
        } )

        const btns = document.querySelectorAll('.btn_del');
        btns.forEach((el) => {
            el.addEventListener('click', () => {
                const product = el.closest('.product'); 
                product.remove();
            });
        })

    } catch (error) {
        console.error(error);
    }
}

fetchData();