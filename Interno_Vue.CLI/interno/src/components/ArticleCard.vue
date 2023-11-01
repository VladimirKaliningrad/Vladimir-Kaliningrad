<template>
    <div :key="item.id" class="article-card__item">
        <img :src="item.src" :alt="item.alt" class="article-card__item-image">
        <div class="article-card__item-tagbox">
            <p class="article-card__item-tag">{{ item.tag }}</p>
        </div>
        <div class="item-content">
            <p class="item-content__title">{{ item.title }}</p>
            <div class="item-content__box">
                <p class="item-content__date">{{ item.date }}</p>
                <router-link to="/blogdetails" class="item-content__button">
                    <svg width="9" height="16" viewBox="0 0 9 16" fill="none" xmlns="http://www.w3.org/2000/svg">
                        <path d="M1.27101 14.9525L7.21387 8.26683L1.27101 1.58112" stroke="#292F36" stroke-width="2"
                            stroke-linecap="round" stroke-linejoin="round" />
                    </svg>
                </router-link>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    name: 'ArticleCard',

    props: {
        item:{
            type: Object,
            required: true
        }
    }
};
</script>

