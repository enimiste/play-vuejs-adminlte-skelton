<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <h2>Hello from vuejs + Play!</h2>
    <button class="btn btn-primary" @click="btnClicked">Click Me</button>
    <div>{{xml}}</div>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  name: 'HelloWorld',
  data () {
    return {
      xml: "",
      msg: 'Welcome to Your Vue.js App'
    }
  },
  methods: {
    btnClicked(){
      axios.get("/xml")
      .then(resp => {
        this.xml = resp.data
      })
      .catch(err => console.error(err))
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
