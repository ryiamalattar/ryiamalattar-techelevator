<template>
    <book-details v-bind:book="book"/>
</template>

<script>
import BookDetails from '@/components/BookDetails';
export default {
    components:
    {
     BookDetails
    },
    computed: {
      book() {
         let bookView = {};
         const books = this.$store.state.books;
         const popularBooks = this.$store.state.popularBooks;
         books.forEach(book => {
          if (book.isbn === this.$route.params.isbn) {
                 bookView = book;
            }
      });
         popularBooks.forEach(book=> {
         if(book.isbn === this.$route.params.isbn) {
         bookView = book;
       }
    })
    return bookView;
   }
  }  
}
</script>

<style>

</style>