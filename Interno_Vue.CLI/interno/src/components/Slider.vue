<template>
    <swiper :style="{
        '--swiper-navigation-color': '#CDA274',
        '--swiper-pagination-color': '#CDA274',
    }" :zoom="true" :navigation="true" :pagination="{
    clickable: true,
}" :modules="modules" class="mySwiper">
        <swiper-slide v-for="picture in sliderPictures">
            <div class="swiper-zoom-container">
                <img class="swiper-slide__img" :src="picture.src" :alt="picture.alt" />
            </div>
        </swiper-slide>
    </swiper>
</template>
<script>
// Import Swiper Vue.js components
import { Swiper, SwiperSlide } from 'swiper/vue';

// Import Swiper styles
import 'swiper/scss';
import 'swiper/scss/zoom';
import 'swiper/scss/navigation';
import 'swiper/scss/pagination';


// import required modules
import { Zoom, Navigation, Pagination } from 'swiper/modules';

export default {
    components: {
        Swiper,
        SwiperSlide,
    },
    setup() {
        return {
            modules: [Zoom, Navigation, Pagination],
        };
    },
    props: {
        sliderPictures:{
            type: Array,
            required: true
        }
    }
};
</script>

