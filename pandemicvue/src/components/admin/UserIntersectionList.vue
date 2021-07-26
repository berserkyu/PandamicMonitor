<template>
  <div>
    <!--搜索-->

    <el-form :inline="true" :model="userIntersectionListForm" class="userIntersection_search">
      <el-form-item label="搜索：">
        <el-input v-model="userIntersectionListForm.userId" placeholder="可疑人物证件号"></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" @click="userIntersectionSearch">搜索可疑人物</el-button>
      </el-form-item>
    </el-form>
    <!--用户相交列表-->
    <el-main>

      <el-table :data="tableData"  highlight-current-row border style="width: 100%;"
                class="userIntersectionList_table" height="500">
        <el-table-column label="用户姓名" prop="fullname"></el-table-column>
        <el-table-column label="用户证件号" prop="idNo"></el-table-column>
        <el-table-column label="接触可疑人物姓名" prop="cautionName"></el-table-column>
        <el-table-column label="接触可疑人物证件号" prop="cautionId"></el-table-column>
        <el-table-column label="接触可疑人物危险水平" prop="cautionLevel"></el-table-column>
        <el-table-column label="地址编号" prop="locId"></el-table-column>
        <el-table-column label="省份" prop="province"></el-table-column>
        <el-table-column label="城市" prop="city"></el-table-column>
        <el-table-column label="地区" prop="area"></el-table-column>
        <el-table-column label="地址" prop="address"></el-table-column>
        <el-table-column label="地点" prop="locName"></el-table-column>
        <el-table-column label="时间" prop="dateVisit"></el-table-column>

      </el-table>
    </el-main>
  </div>
</template>

<script>
  export default{
    mounted() {
      this.getdata();
    },
    name:'UserIntersectionList',
    data(){
      return{
        tableData: [],
        userIntersectionListForm:{
          userId: '',
          userIntersectionId: ''
        }
      }
    },
    methods:{
      userSearch(){
        this.$axios
          .post('/',{
            idNo: this.userIntersectionListForm.userId
          })
          .then(successResponse => {
            console.log("success");
            this.tableData = successResponse.data.tableData;
          }) .catch(failResponse =>{alert("跨域操作失败！")})
      },
      userIntersectionSearch(){
        this.$axios
          .post('/visit/getintersections',{
            idNo: this.userIntersectionListForm.userId
          })
          .then(successResponse => {
            if(successResponse.data.code===200){
              console.log("success");
              this.tableData = successResponse.data.tableData;
            }else{
              alert("搜索失败")
            }

          }) .catch(failResponse =>{alert("操作失败！")})
      },
      getdata(){
        this.$axios
          .get('/')
          .then(successResponse => {
            console.log(successResponse.data.code);
            if(successResponse.data.code === 200){}
              this.tableData = successResponse.data.tableData;
          })
          //.catch(failResponse =>{alert("跨域操作失败！")})
      }
    }
  }
</script>

<style scoped>

  .userIntersection_search{
    padding-top: 20px;
    padding-left: 30px;
  }


</style>
