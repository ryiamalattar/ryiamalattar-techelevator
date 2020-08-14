<template>
  <div>
      <form class="new-book-form" v-on:submit.prevent="addNewBook">
      
        <label for="title">Enter Title:</label>
        <input id="title" class="title-input" type="text" v-model="newBook.title" />
      
      
        <label for="auther">Enter Auther:</label>
        <input id="auther" class="author-input" type="text" v-model="newBook.author" />
      
      
        <label for="isbn">Enter ISBN:</label>
        <input id="isbn" class="isbn-input" type="text" v-model="newBook.isbn" />
      
      <input type="submit" value="Add Book">
      
      </form>
  </div>    
</template>

<script>
export default {
    name: "new-book",
    data() {
        return {
            newBook:{
                read: false,
            }
        };
    },
    methods: {
        addNewBook(){
          this.$store.commit("ADD_BOOK" , this.newBook);
          this.resetForm();
        },
        resetForm(){
            this.newBook={};
        }
    }
}
</script>

<style>

</style>