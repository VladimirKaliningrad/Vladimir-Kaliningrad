<template>
    <section class="banner center">
        <div class="banner__content">
            <div class="banner__subcontent-box">
                <div class="bunner__subcontent">
                    <h1 class="banner__subcontent-heading">Let Your Home Be Unique</h1>
                    <p class="banner__subcontent-text">There are many variations of the passages of lorem Ipsum
                        fromavailable, majority.</p>
                </div>
                <BlackButton :button-text="buttonText" :link="link" class="button" />
            </div>
        </div>
    </section>
    <section class="project center">
        <div class="project__content">
            <h2 class="project__heading">Follow Our Projects</h2>
            <div class="project__text-box">
                <p class="project__text">
                    It is a long established fact that a reader will be distracted by the of readable content of page
                    lookings at its layouts points.
                </p>
            </div>
            <div class="project__items">
                <div v-for="project in listOfProjects" :key="project.id" class="project__item">
                    <img class="project__item-image" :src="project.src" :alt="project.alt">
                    <div class="project__item-content">
                        <div class="project__item-box">
                            <p class="project__item-title">{{ project.firstparagraph }}</p>
                            <p class="project__item-subtitle">{{ project.secondparagraph }}</p>
                        </div>
                        <router-link :to="secondLink" class="project__item-button">
                            <svg width="9" height="16" viewBox="0 0 9 16" fill="none" xmlns="http://www.w3.org/2000/svg">
                                <path d="M1.27101 14.9525L7.21387 8.26683L1.27101 1.58112" stroke="#292F36" stroke-width="2"
                                    stroke-linecap="round" stroke-linejoin="round" />
                            </svg>
                        </router-link>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <div class="counter">
        <div class="counter__content">
            <div class="counter__content-items">
                <div v-for="counter in listOfCounters" :key="counter.id" class="counter__content-item">
                    <p class="content-item__number">{{ counter.number }}</p>
                    <p class="content-item__text">{{ counter.text }}</p>
                </div>
            </div>
        </div>
    </div>
    <section class="blog center">
        <div class="blog__content">
            <h2 class="blog__heading">Articles & News</h2>
            <div class="blog__text-box ">
                <p class="blog__text">It is a long established fact that a reader will
                    be distracted by the of readable content of a page when lookings at its
                    layouts the points of using.</p>
            </div>
            <div class="blog__items">
                <ArticleCard v-for="item in listOfBlogs" :item="item" />
            </div>
        </div>
    </section>
</template>

<script>
import ArticleCard from '../components/ArticleCard.vue'
import BlackButton from '@/components/BlackButton.vue';

export default {
    name: 'HomePage',

    components: {
        ArticleCard,
        BlackButton
    },

    data() {
        return {
            buttonText: 'Get Started',
            link: '/project',
            secondLink: '/project',
            listOfProjects: [
                {
                    id: 'first-project', src: require('@/assets/images/project-photo1.png'), alt: 'first project', firstparagraph: 'Modern Kitchen', secondparagraph: 'Decor / Artchitecture'
                },
                {
                    id: 'second-project', src: require('@/assets/images/project-photo2.png'), alt: 'second project', firstparagraph: 'Modern Kitchen', secondparagraph: 'Decor / Artchitecture'
                },
                {
                    id: 'third-project', src: require('@/assets/images/project-photo3.png'), alt: 'third project', firstparagraph: 'Modern Kitchen', secondparagraph: 'Decor / Artchitecture'
                },
                {
                    id: 'fourth-project', src: require('@/assets/images/project-photo4.png'), alt: 'fourth project', firstparagraph: 'Modern Kitchen', secondparagraph: 'Decor / Artchitecture'
                }
            ],
            listOfCounters: [
                {
                    id: 'first-counter', number: '12', text: 'Years Of Experiance'
                },
                {
                    id: 'second-counter', number: '85', text: 'Success Project'
                },
                {
                    id: 'third-counter', number: '15', text: 'Active Project'
                },
                {
                    id: 'fourth-counter', number: '95', text: 'Happy Customers'
                }
            ],
            listOfBlogs: [
                {
                    id: 'first-blog', src: require('@/assets/images/blog-photo1.png'), alt: 'first blog', tag: 'Kitchen Design', title: 'Let’s Get Solution For Building Construction Work', date: '26 December,2022'
                },
                {
                    id: 'second-blog', src: require('@/assets/images/blog-photo2.png'), alt: 'second blog', tag: 'Living Design', title: 'Low Cost Latest Invented Interior Designing Ideas', date: '22 December,2022'
                },
                {
                    id: 'third-blog', src: require('@/assets/images/blog-photo3.png'), alt: 'third blog', tag: 'Interior Design', title: 'Best For Any Office & Business Interior Solution', date: '25 December,2022'
                }
            ]
        };
    },
};
</script>

<style lang="scss" scoped>
.button :deep(.button__paddings) {
    padding: 26px 49px 26px 48px;
}
</style>