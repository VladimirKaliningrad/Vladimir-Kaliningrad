<template>
    <header class="header center">
        <div class="header__content">
            <router-link to="/" class="header__logo">
                <img class="header__logo-img" src="../assets/images/logo.svg" alt="logo">
            </router-link>
            <Navigation class="navigation" />
        </div>
    </header>
</template>
<script>
import Navigation from './Navigation.vue';

export default {
    name: 'Header',

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
    gap: 25px;
}

.navigation :deep(.navigation__link) {
    @include font-jost-regular($secondPrimaryColor, 20px, 1.25);
    text-align: center;

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
