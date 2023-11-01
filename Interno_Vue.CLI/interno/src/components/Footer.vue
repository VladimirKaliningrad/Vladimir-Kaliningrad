<template>
    <footer class="footer center">
        <div class="footer__content">
            <div class="footer__items">
                <div class="footer__item">
                    <a href="#" class="footer__logo">
                        <img class="footer__logo-img" src="../assets/images/logo.svg" alt="logo">
                    </a>
                    <p class="footer__item-text">It is a long established fact that a reader will
                        be distracted lookings.</p>
                    <ul class="footer__icons-box">
                        <li class="footer__icon-item">
                            <a href="#" class="footer__icon-link">
                                <img src="../assets/images/tweeter.svg" alt="tweeter icon" class="footer__social-img">
                            </a>
                        </li>
                        <li class="footer__icon-item">
                            <a href="#" class="footer__icon-link">
                                <img src="../assets/images/linkedin.svg" alt="linkedin icon">
                            </a>
                        </li>
                    </ul>
                </div>
                <div class="footer__item">
                    <p class="footer__item-heading">Pages</p>
                    <Navigation class="navigation" />
                </div>
                <div class="footer__item">
                    <p class="footer__item-heading">Contact</p>
                    <p class="footer__contact-address">
                        55 East Birchwood Ave. Brooklyn, New York 11201
                    </p>
                    <a class="footer__contact-email" href="mailto:contact@interno.com">contact@interno.com</a>
                    <a class="footer__contact-phone" href="tel:1234567890"> (123) 456 - 7890</a>
                </div>
            </div>
        </div>
    </footer>
</template>

<script>
import Navigation from './Navigation.vue';

export default {
    name: 'Footer',

    components: {
        Navigation
    }
};
</script>

<style lang="scss" scoped>
@import '../assets/scss/_vars.scss';
@import '../assets/scss/_mixins.scss';
.navigation :deep(.navigation__list) {
    display: flex;
    flex-direction: column;
    align-content: flex-start;
    justify-content: center;
    align-items: flex-start;
    margin: 0;

}

.navigation :deep(.navigation__item) {
    padding-bottom: 24px;
}

.navigation :deep(.navigation__link) {
    @include font-jost-regular($fourthPrimaryColor, 22px, 1.5);
    letter-spacing: 0.22;
    margin: 0;

    &:hover {
        color: $firstPrimaryColor;
        @include transition-slow();
    }

    &:active {
        color: $fourthPrimaryColor;
        @include transition-slow();
    }

    &:focus {
        color: $firstPrimaryColor;
        @include transition-slow();
    }
}
</style>

