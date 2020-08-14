<template>
  <div class="book-container">
    <book-card v-for="book in bookDisplay"
     v-bind:key="book.title" v-bind:book="book"></book-card>
  </div>
</template>

<script>
import BookCard from "./BookCard";
export default {
    name: 'reading-list',
    components: {
      BookCard
    },
  computed: {
    bookDisplay(){
      const books = this.$store.state.books;
      return books;
    }
  }
};
</script>

<style>
.book-container {
    display:flex;
    justify-content: space-evenly;
    flex-wrap: wrap;
}
</style>