<template>
    <div class="not-found center">
        <div v-for="info in notFoundInfo" class="not-found__content">
            <div class="not-found__content_right">
                <p class="not-found__title">{{ info.title }}</p>
                <p class="not-found__text">{{ info.text }}</p>
                <BlackButton :button-text="buttonText" :link="link" class="button"/>
            </div>
            <div class="not-found__content_left">
                <img class="not-found__image" :src="info.src" :alt="info.alt">
            </div>
        </div>
    </div>
</template>

<script>
import BlackButton from '@/components/BlackButton.vue';

export default {

    name: 'NotFound',

    components: {
        BlackButton
    },

    data() {
        return {
            buttonText: 'Back To Home',
            link: '/',
            notFoundInfo: [
                {
                    title: '404',
                    text: 'We are sorry, but the page you requested was not found',
                    src: require('@/assets/images/not_found_img.png'),
                    alt: "not-found picture"
                }
            ]
        };
    },
};
</script>

<style lang="scss" scoped>
.button :deep(.button__paddings) {
    padding: 26px 54px 26px 54px;
}
</style>