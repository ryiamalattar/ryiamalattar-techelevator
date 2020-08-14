<template>
  <div class="book-container">
    <book-card v-bind:book="book" v-for="book in $store.state.books" v-bind:key="book.isbn" />
    <router-link class="link-position" v-bind:to="{name: 'new-book'}">Add Book To Reading List </router-link>
  </div>
  
  
</template>

<script>
import BookCard from '@/components/BookCard.vue';

export default {
    name: 'reading-list',
    components: {
        BookCard
    }
}
</script>

<style>
.book-container {
    display:flex;
    justify-content: space-evenly;
    flex-wrap: wrap;
}
.link-position{
  position: absolute;
  bottom: 0;
}
</style>