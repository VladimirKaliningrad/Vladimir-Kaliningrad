<!-- Вы разрабатываете приложение для интернет-магазина и у вас есть компонент Vue под названием "ProductDetails". Компонент отображает детали о конкретном продукте, включая его название, цену и статус доступности.

Внутри компонента "ProductDetails" создайте свойство "product" с объектом, представляющим информацию о продукте. Объект должен иметь свойства "name" (название продукта), "price" (цена продукта) и "available" (флаг, указывающий на доступность продукта).
Используя вычисляемое свойство, назовите его "formattedPrice", которое будет возвращать форматированную цену продукта со знаком валюты. Например, если цена равна 99.99, вычисляемое свойство должно вернуть строку "$99.99".
В компоненте "ProductDetails" отобразите название продукта, его форматированную цену и статус доступности.
Если продукт доступен, отобразите текст "Available", в противном случае - "Out of stock". -->

<template>
    <div class="product-display">
        <div class="product-container">
            <div class="product-image">
                <img :src="product.image" :alt="alt">
            </div>
            <div class="product-info">
                <h1>{{ product.name }}</h1>
                <h2 v-if="product.available">Available</h2>
                <h2 v-else>Out of Stock</h2>
                <p>Price: {{ formattedPrice }}</p>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    name: 'ProductDetails',

    data() {
        return {
            product: {
                name: 'cool shirt',
                price: '99.99',
                available: true,
                image: require('../assets/images/shirt.jpg'),
                alt: 'shirt',
            },
        }
    },

    computed: {
        formattedPrice: function () {
            return `$${this.product.price}`;
        }
    }
};
</script>

<style lang="css" scoped>
body {
    background-color: #f2f2f2;
    margin: 0px;
    font-family: tahoma;
    color: #282828;
}

h1 {
    font-size: 50px;
    margin: 0;
    margin-bottom: 20px;
}

h2 {
    font-size: 25px;
    margin: 0;
    margin-bottom: 20px;
}

p {
    font-size: 22px;
    margin: 0;
    margin-bottom: 20px;
}

img {
    border: 2px solid #d8d8d8;
    width: 70%;
    margin: 40px;
    padding: 15px;
    box-shadow: 2px 15px -12px rgba(0, 0, 0, 0.57);
}

.product-display {
    display: flex;
    flex-direction: column;
    padding: 1rem;
    background-color: rgb(223, 223, 241);
}

.product-container {
    display: flex;
    flex-direction: row;
    flex-wrap: nowrap;
}

.product-image {
    width: 50%;
}

.product-info {
    margin-top: 50px;
    width: 50%;
}
</style>