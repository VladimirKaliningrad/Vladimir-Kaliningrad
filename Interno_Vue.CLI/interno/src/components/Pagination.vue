<template>
    <div class="pagination">
        <ul class="pagination__box">
            <li class="pagination__item">
                <button @click="onClickPreviousPage" :disabled="isInFirstPage" class="pagination__button" type="button">
                    <svg height="32" width="25" viewBox="0 0 32 25" xmlns="http://www.w3.org/2000/svg">
                        <path
                            d="M20,25a1,1,0,0,1-.71-.29l-8-8a1,1,0,0,1,0-1.42l8-8a1,1,0,1,1,1.42,1.42L13.41,16l7.3,7.29a1,1,0,0,1,0,1.42A1,1,0,0,1,20,25Z" />
                    </svg>
                </button>
            </li>
            <li v-for="page in pages" class="pagination__item">
                <button @click="onClickPage(page.name)" :disabled="page.isDisabled"
                    :class="{ pagination__item_active: isPageActive(page.name) }" class="pagination__button" type="button">
                    0{{ page.name }}
                </button>
            </li>
            <li class="pagination__item">
                <button @click="onClickNextPage" :disabled="isInLastPage" class="pagination__button" type="button">
                    <svg class="pagination__svg" height="32" width="25" viewBox="0 0 32 25"
                        xmlns="http://www.w3.org/2000/svg">
                        <path
                            d="M12,25a1,1,0,0,1-.71-.29,1,1,0,0,1,0-1.42L18.59,16l-7.3-7.29a1,1,0,1,1,1.42-1.42l8,8a1,1,0,0,1,0,1.42l-8,8A1,1,0,0,1,12,25Z" />
                    </svg>
                </button>
            </li>
        </ul>
    </div>
</template>

<script>
export default {
    name: 'Pagination',

    props: {
        maxVisibleButtons: {
            type: Number,
            required: false,
            default: 3,
            validator: function(value) {
                return value >= 0;
            }
        },
        totalNumberPaginationPages: {
            type: Number,
            required: true,
            validator: function(value) {
                return value >= 0;
            }
        },
        currentPage: {
            type: Number,
            required: true,
            validator: function(value) {
                return value >= 0;
            }
        },
    },
    computed: {
        startPage() {
            if (this.currentPage === 1) {
                return 1;
            }

            if (this.currentPage === this.totalNumberPaginationPages) {
                return this.totalNumberPaginationPages - this.maxVisibleButtons + 1;
            }

            return this.currentPage - 1;

        },
        endPage() {
            return Math.min(this.startPage + this.maxVisibleButtons - 1, this.totalNumberPaginationPages);
        },
        pages() {
            const range = [];

            for (let i = this.startPage; i <= this.endPage; i += 1) {
                range.push({
                    name: i,
                    isDisabled: i === this.currentPage
                });
            }

            return range;
        },
        isInFirstPage() {
            return this.currentPage === 1;
        },
        isInLastPage() {
            return this.currentPage === this.totalNumberPaginationPages;
        },
    },
    methods: {
        onClickFirstPage() {
            this.$emit('pagechanged', 1);
        },
        onClickPreviousPage() {
            this.$emit('pagechanged', this.currentPage - 1);
        },
        onClickPage(page) {
            this.$emit('pagechanged', page);
        },
        onClickNextPage() {
            this.$emit('pagechanged', this.currentPage + 1);
        },
        onClickLastPage() {
            this.$emit('pagechanged', this.totalNumberPaginationPages);
        },
        isPageActive(page) {
            return this.currentPage === page;
        },
    }
};
</script>
