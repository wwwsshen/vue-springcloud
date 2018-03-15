<template>
  <div>
    <view-cont
      :listData="listData"
      :listValue="listValue"
      className="compVidewCont"
      labelWidth="95"
      col="3"
    />
  </div>
</template>

<script>
  import viewCont from 'pkgs/components/view-cont'

  export default {
    components: {
      viewCont
    },
    data() {
      return {
        listData: [
          {label: '姓名', prop: 'name'},
          {label: '年龄', prop: 'age'},
          {label: '性别', prop: 'sex'},
          {label: '住址', prop: 'desc'},
        ],
        listValue: {
          name: 'sgsg',
          age: '30',
          sex: '1',
          desc: 'dgegjkegkeheri俄奥结果'
        }
      }
    }
  }
</script>

<style lang="scss" scoped>
  .compVidewCont{
    // todo
  }
</style>
