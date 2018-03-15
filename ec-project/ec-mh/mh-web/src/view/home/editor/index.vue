<template>
  <div id="app">
    <CompEditor></CompEditor>
  </div>
</template>

<script>
  import CompEditor from 'pkgs/components/editor'

  export default {
    name: 'editor',
    components: {
      CompEditor
    },

    data() {
      return {
        htmlForEditor: ''
      }
    },
    methods: {}
  }
</script>
