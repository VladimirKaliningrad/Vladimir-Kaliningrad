<template>
    <section class="intro">
        <div class="intro__content">
            <div class="intro__title-content">
                <h2 class="intro__heading">Articles & News</h2>
                <ul class="intro__breadcrumbs">
                    <li class="intro__breadcrumbs-item">
                        <router-link to="/" class="intro__breadcrumbs-link">Home</router-link>
                    </li>
                    <li class="intro__breadcrumbs-item">
                        <a href="#" class="intro__breadcrumbs-link">Blog</a>
                    </li>
                </ul>
            </div>
        </div>
    </section>
    <section class="post center">
        <div class="post__content">
            <h2 class="post__heading">Latest Post</h2>
            <div class="post__subcontent-box">
                <img src="../assets/images/blog_post.png" alt="post image">
                <article class="post__subcontent">
                    <div class="post__subcontent-container">
                        <h3 class="post__subcontent-heading">Low Cost Latest Invented Interior Designing Ideas</h3>
                        <p class="post__subcontent-text">Lorem ipsum dolor sit amet, adipiscing Aliquam eusem vitae turpis
                            dignissim maximus.posuere in. Contrary to popular belief.</p>
                        <p class="post__subcontent-text">Lorem Ipsum is not simply random text. It has roots in a piece of
                            classica.</p>
                    </div>
                    <div class="post__subtitle-box">
                        <p class="post__subcontent-subtitle">26 December,2022</p>
                        <button class="post__button">
                            <svg width="9" height="16" viewBox="0 0 9 16" fill="none" xmlns="http://www.w3.org/2000/svg">
                                <path d="M1.27101 14.9525L7.21387 8.26683L1.27101 1.58112" stroke="#292F36" stroke-width="2"
                                    stroke-linecap="round" stroke-linejoin="round" />
                            </svg>
                        </button>
                    </div>
                </article>
            </div>
        </div>
    </section>
    <section class="news center">
        <div class="news__content">
            <h2 class="news__heading">Articles & News</h2>
            <div class="news__items">
                <ArticleCard v-for="item in displayedCards" :item="item" />
            </div>
            <Pagination :totalNumberPaginationPages="setTotalNumberOfPages()"
                :currentPage="currentPage"  @pagechanged="changeCurrentPage" />
        </div>
    </section>
</template>

<script>
import ArticleCard from '../components/ArticleCard.vue';
import Pagination from '../components/Pagination.vue';
import { mapGetters } from 'vuex';


export default {
    name: 'Blog',

    components: {
        ArticleCard,
        Pagination
    },
    data() {
        return {
            currentPage: 1,//текущая просматриваемая страница
            limitOfCardsPerPage: 6,//количество карточек будем выводить на текущей странице
        };
    },
    methods: {
        setTotalNumberOfPages() { //вычисляем общее кол-во страниц
            return Math.ceil(this.getListOfCards.length / this.limitOfCardsPerPage);
        },
        paginateListOfCards(listOfCards) {
            let page = this.currentPage;
            let perPage = this.limitOfCardsPerPage;
            let from = (page * perPage) - perPage;
            let to = (page * perPage);
            return listOfCards.slice(from, to);
        },
        changeCurrentPage(page) {
            console.log(page)
            this.currentPage = page;
        }
    },
    computed: {
        ...mapGetters(['getListOfCards']),
        displayedCards() {
            return this.paginateListOfCards(this.getListOfCards);
        }
    }
};
</script>




<style>
/* <!-- https://codepen.io/alligatorio/pen/zWvpRp -->
<!-- КАК СОЗДАТЬ КОМПОНЕНТ ПАГИНАЦИИ В VUE.JS -->
<!-- https://www.8host.com/blog/kak-sozdat-komponent-paginacii-v-vue-js/  */
</style>








