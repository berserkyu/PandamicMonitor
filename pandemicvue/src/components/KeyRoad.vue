<template>
  <div class="keyroad_container">
    <!--省市侧边标签页-->
    <el-tabs :tab-position="tabPosition" class="tabPosition">

      <!--安徽省-->
      <el-tab-pane>
        <span slot="label"><i class="el-icon-location-outline"></i>安徽省</span>
        <el-tabs :tab-position="tabPosition2" class="tabPosition2">
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>安庆市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>蚌埠市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>亳州市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>池州市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>滁州市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>阜阳市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>合肥市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>淮北市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>淮南市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>黄山市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>六安市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>马鞍山市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>宿州市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>铜陵市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>芜湖市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>宣城市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
        </el-tabs>
      </el-tab-pane>

      <!--北京市-->
      <el-tab-pane>
        <span slot="label"><i class="el-icon-location-outline"></i>北京市</span>
        <el-tabs :tab-position="tabPosition2" class="tabPosition2">
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>昌平区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>朝阳区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>大兴区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>东城区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>房山区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>丰台区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>海淀区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>怀柔区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>门头沟区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>密云区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>平谷区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>石景山区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>顺义区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>通州区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>西城区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>延庆区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
        </el-tabs>
      </el-tab-pane>

      <!--重庆市-->
      <el-tab-pane>
        <span slot="label"><i class="el-icon-location-outline"></i>重庆市</span>
        <el-tabs :tab-position="tabPosition2" class="tabPosition2">
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>巴南区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>北碚区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>璧山区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>长寿区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>大渡口区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>大足区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>涪陵区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>合川区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>江北区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>江津区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>九龙坡区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>梁平区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>开州区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>南岸区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>南川区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>綦江区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>黔江区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>荣昌区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>沙坪坝区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>铜梁区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>潼南区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>万州区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>武隆区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>永川区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>渝北区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>渝中区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>城口县</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>垫江县</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>丰都县</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>奉节县</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>巫山县</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>巫溪县</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>云阳县</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>忠县</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>彭水苗族土家族自治县</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>石柱土家族自治县</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>秀山土家族苗族自治县</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>酉阳土家族苗族自治县</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
        </el-tabs>
      </el-tab-pane>

      <!--福建省-->
      <el-tab-pane>
        <span slot="label"><i class="el-icon-location-outline"></i>福建省</span>
        <el-tabs :tab-position="tabPosition2" class="tabPosition2">
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>福州市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>龙岩市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>南平市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>宁德市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>莆田市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>泉州市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>三明市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>厦门市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>漳州市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>平潭综合实验区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
        </el-tabs>
      </el-tab-pane>

      <!--甘肃省-->
      <el-tab-pane>
        <span slot="label"><i class="el-icon-location-outline"></i>甘肃省</span>
        <el-tabs :tab-position="tabPosition2" class="tabPosition2">
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>白银市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>定西市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>嘉峪关市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>金昌市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>酒泉市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>兰州市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>陇南市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>平凉市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>庆阳市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>天水市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>武威市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>张掖市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>甘南藏族自治州</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>临夏回族自治州</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
        </el-tabs>
      </el-tab-pane>

      <!--广东省-->
      <el-tab-pane>
        <span slot="label"><i class="el-icon-location-outline"></i>广东省</span>
        <el-tabs :tab-position="tabPosition2" class="tabPosition2">
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>潮州市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>东莞市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>佛山市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>广州市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>河源市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>惠州市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>江门市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>揭阳市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>茂名市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>梅州市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>清远市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>汕头市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>汕尾市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>韶关市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>深圳市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>阳江市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>云浮市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>湛江市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>肇庆市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>中山市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>珠海市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
        </el-tabs>
      </el-tab-pane>

      <!--广西壮族自治区-->
      <el-tab-pane>
        <span slot="label"><i class="el-icon-location-outline"></i>广西壮族自治区</span>
        <el-tabs :tab-position="tabPosition2" class="tabPosition2">
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>百色市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>北海市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>崇左市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>防城港市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>贵港市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>桂林市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>河池市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>贺州市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>来宾市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>柳州市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>南宁市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>钦州市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>梧州市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>玉林市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
        </el-tabs>
      </el-tab-pane>

      <!--贵州省-->
      <el-tab-pane>
        <span slot="label"><i class="el-icon-location-outline"></i>贵州省</span>
        <el-tabs :tab-position="tabPosition2" class="tabPosition2">
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>安顺市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>毕节市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>贵阳市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>六盘水市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>铜仁市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>遵义市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>黔东南苗族侗族自治州</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>黔南布依族苗族自治州</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>黔西南布依族苗族自治州</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
        </el-tabs>
      </el-tab-pane>

      <!--海南省-->
      <el-tab-pane>
        <span slot="label"><i class="el-icon-location-outline"></i>海南省</span>
        <el-tabs :tab-position="tabPosition2" class="tabPosition2">
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>儋州市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>海口市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>三沙市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>三亚市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>澄迈县</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>定安县</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>东方市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>临高县</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>琼海市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>屯昌县</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>万宁市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>文昌市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>五指山市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>白沙黎族自治县</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>保亭黎族苗族自治县</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>昌江黎族自治县</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>乐东黎族自治县</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>陵水黎族自治县</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>琼中黎族苗族自治县</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
        </el-tabs>
      </el-tab-pane>

      <!--河北省-->
      <el-tab-pane>
        <span slot="label"><i class="el-icon-location-outline"></i>河北省</span>
        <el-tabs :tab-position="tabPosition2" class="tabPosition2">
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>保定市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>沧州市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>承德市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>邯郸市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>衡水市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>廊坊市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>秦皇岛市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>石家庄市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>唐山市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>邢台市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>张家口市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
        </el-tabs>
      </el-tab-pane>

      <!--河南省-->
      <el-tab-pane>
        <span slot="label"><i class="el-icon-location-outline"></i>河南省</span>
        <el-tabs :tab-position="tabPosition2" class="tabPosition2">
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>安阳市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>鹤壁市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>济源市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>焦作市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>开封市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>漯河市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>洛阳市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>南阳市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>平顶山市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>濮阳市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>三门峡市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>商丘市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>新乡市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>信阳市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>许昌市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>郑州市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>周口市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>驻马店市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
        </el-tabs>
      </el-tab-pane>

      <!--黑龙江省-->
      <el-tab-pane>
        <span slot="label"><i class="el-icon-location-outline"></i>黑龙江省</span>
        <el-tabs :tab-position="tabPosition2" class="tabPosition2">
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>大庆市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>大兴安岭地区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>哈尔滨市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>鹤岗市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>黑河市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>鸡西市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>佳木斯市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>牡丹江市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>齐齐哈尔市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>七台河市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>双鸭山市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>绥化市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>伊春市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
        </el-tabs>
      </el-tab-pane>

      <!--湖北省-->
      <el-tab-pane>
        <span slot="label"><i class="el-icon-location-outline"></i>湖北省</span>
        <el-tabs :tab-position="tabPosition2" class="tabPosition2">
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>鄂州市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>黄冈市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>黄石市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>荆门市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>荆州市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>十堰市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>随州市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>武汉市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>襄阳市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>咸宁市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>孝感市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>宜昌市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>恩施土家族苗族自治州</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>潜江市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>天门市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>仙桃市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>神农架林区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
        </el-tabs>
      </el-tab-pane>

      <!--湖南省-->
      <el-tab-pane>
        <span slot="label"><i class="el-icon-location-outline"></i>湖南省</span>
        <el-tabs :tab-position="tabPosition2" class="tabPosition2">
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>常德市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>长沙市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>郴州市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>衡阳市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>怀化市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>娄底市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>邵阳市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>湘潭市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>益阳市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>永州市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>岳阳市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>张家界市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>株洲市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>湘西土家族苗族自治州</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
        </el-tabs>
      </el-tab-pane>

      <!--吉林省-->
      <el-tab-pane>
        <span slot="label"><i class="el-icon-location-outline"></i>吉林省</span>
        <el-tabs :tab-position="tabPosition2" class="tabPosition2">
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>白城市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>白山市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>长春市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>吉林市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>辽源市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>四平市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>松原市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>通化市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>延边朝鲜族自治州</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
        </el-tabs>
      </el-tab-pane>

      <!--江苏省-->
      <el-tab-pane>
        <span slot="label"><i class="el-icon-location-outline"></i>江苏省</span>
        <el-tabs :tab-position="tabPosition2" class="tabPosition2">
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>常州市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>淮安市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>连云港市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>南京市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>南通市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>宿迁市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>苏州市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>泰州市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>无锡市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>徐州市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>盐城市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>扬州市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>镇江市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
        </el-tabs>
      </el-tab-pane>

      <!--江西省-->
      <el-tab-pane>
        <span slot="label"><i class="el-icon-location-outline"></i>江西省</span>
        <el-tabs :tab-position="tabPosition2" class="tabPosition2">
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>抚州市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>赣州市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>吉安市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>景德镇市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>九江市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>南昌市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>萍乡市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>上饶市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>新余市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>宜春市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>鹰潭市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
        </el-tabs>
      </el-tab-pane>

      <!--辽宁省-->
      <el-tab-pane>
        <span slot="label"><i class="el-icon-location-outline"></i>辽宁省</span>
        <el-tabs :tab-position="tabPosition2" class="tabPosition2">
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>鞍山市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>本溪市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>朝阳市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>大连市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>丹东市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>抚顺市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>阜新市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>葫芦岛市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>锦州市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>辽阳市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>盘锦市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>沈阳市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>铁岭市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>营口市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
        </el-tabs>
      </el-tab-pane>

      <!--内蒙古自治区-->
      <el-tab-pane>
        <span slot="label"><i class="el-icon-location-outline"></i>内蒙古自治区</span>
        <el-tabs :tab-position="tabPosition2" class="tabPosition2">
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>巴彦淖尔市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>包头市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>赤峰市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>鄂尔多斯市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>呼和浩特市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>呼伦贝尔市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>通辽市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>乌海市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>乌兰察布市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>阿拉善盟</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>锡林郭勒盟</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>兴安盟</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
        </el-tabs>
      </el-tab-pane>

      <!--宁夏回族自治区-->
      <el-tab-pane>
        <span slot="label"><i class="el-icon-location-outline"></i>宁夏回族自治区</span>
        <el-tabs :tab-position="tabPosition2" class="tabPosition2">
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>固原市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>石嘴山市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>吴忠市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>银川市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>中卫市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
        </el-tabs>
      </el-tab-pane>

      <!--青海省-->
      <el-tab-pane>
        <span slot="label"><i class="el-icon-location-outline"></i>青海省</span>
        <el-tabs :tab-position="tabPosition2" class="tabPosition2">
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>海东市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>西宁市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>果洛藏族自治州</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>海北藏族自治州</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>海南藏族自治州</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>黄南藏族自治州</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>海西蒙古族藏族自治州</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>玉树藏族自治州</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
        </el-tabs>
      </el-tab-pane>

      <!--山东省-->
      <el-tab-pane>
        <span slot="label"><i class="el-icon-location-outline"></i>山东省</span>
        <el-tabs :tab-position="tabPosition2" class="tabPosition2">
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>滨州市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>德州市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>东营市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>菏泽市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>济南市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>济宁市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>聊城市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>临沂市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>青岛市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>日照市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>泰安市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>潍坊市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>威海市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>烟台市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>枣庄市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>淄博市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
        </el-tabs>
      </el-tab-pane>

      <!--山西省-->
      <el-tab-pane>
        <span slot="label"><i class="el-icon-location-outline"></i>山西省</span>
        <el-tabs :tab-position="tabPosition2" class="tabPosition2">
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>长治市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>大同市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>晋城市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>晋中市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>临汾市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>吕梁市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>朔州市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>太原市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>忻州市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>阳泉市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>运城市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
        </el-tabs>
      </el-tab-pane>

      <!--陕西省-->
      <el-tab-pane>
        <span slot="label"><i class="el-icon-location-outline"></i>陕西省</span>
        <el-tabs :tab-position="tabPosition2" class="tabPosition2">
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>安康市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>宝鸡市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>汉中市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>商洛市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>铜川市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>渭南市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>西安市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>咸阳市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>延安市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>榆林市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
        </el-tabs>
      </el-tab-pane>

      <!--上海市-->
      <el-tab-pane>
        <span slot="label"><i class="el-icon-location-outline"></i>上海市</span>
        <el-tabs :tab-position="tabPosition2" class="tabPosition2">
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>宝山区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>长宁区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>崇明区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>奉贤区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>黄浦区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>虹口区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>嘉定区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>金山区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>静安区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>闽行区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>浦东新区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>普陀区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>青浦区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>松江区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>徐汇区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>杨浦区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
        </el-tabs>
      </el-tab-pane>

      <!--四川省-->
      <el-tab-pane>
        <span slot="label"><i class="el-icon-location-outline"></i>四川省</span>
        <el-tabs :tab-position="tabPosition2" class="tabPosition2">
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>巴中市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>成都市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>达州市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>德阳市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>广安市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>广元市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>乐山市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>泸州市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>眉山市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>绵阳市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>南充市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>内江市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>攀枝花市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>遂宁市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>雅安市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>宜宾市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>自贡市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>资阳市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>阿坝藏族羌族自治州</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>甘孜藏族自治州</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>凉山彝族自治州</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
        </el-tabs>
      </el-tab-pane>

      <!--天津市-->
      <el-tab-pane>
        <span slot="label"><i class="el-icon-location-outline"></i>天津市</span>
        <el-tabs :tab-position="tabPosition2" class="tabPosition2">
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>宝坻区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>北辰区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>滨海新区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>东丽区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>河北区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>河东区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>和平区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>河西区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>红桥区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>蓟州区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>津南区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>静海区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>南开区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>宁河区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>武清区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>西青区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
        </el-tabs>
      </el-tab-pane>

      <!--西藏自治区-->
      <el-tab-pane>
        <span slot="label"><i class="el-icon-location-outline"></i>西藏自治区</span>
        <el-tabs :tab-position="tabPosition2" class="tabPosition2">
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>昌都市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>拉萨市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>林芝市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>那曲市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>日喀则市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>山南市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>阿里地区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
        </el-tabs>
      </el-tab-pane>

      <!--新疆维吾尔自治区-->
      <el-tab-pane>
        <span slot="label"><i class="el-icon-location-outline"></i>新疆维吾尔自治区</span>
        <el-tabs :tab-position="tabPosition2" class="tabPosition2">
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>哈密市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>克拉玛依市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>吐鲁番市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>乌鲁木齐市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>阿拉尔市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>北屯市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>胡杨河市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>可克达拉市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>昆玉市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>石河子市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>双河市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>铁门关市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>图木舒克市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>五家渠市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>新星市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>阿克苏地区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>阿勒泰地区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>和田地区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>喀什地区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>塔城地区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>巴音郭楞蒙古自治州</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>博尔塔拉蒙古自治州</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>昌吉回族自治州</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>克孜勒苏柯尔克孜自治州</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>伊犁哈萨克自治州</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
        </el-tabs>
      </el-tab-pane>

      <!--云南省-->
      <el-tab-pane>
        <span slot="label"><i class="el-icon-location-outline"></i>云南省</span>
        <el-tabs :tab-position="tabPosition2" class="tabPosition2">
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>保山市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>昆明市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>丽江市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>临沧市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>普洱市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>曲靖市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>玉溪市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>昭通市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>楚雄彝族自治州</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>大理白族自治州</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>德宏傣族景颇族自治州</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>迪庆藏族自治州</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>红河哈尼族彝族自治州</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>怒江傈僳族自治州</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>文山壮族苗族自治州</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>西双版纳傣族自治州</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
        </el-tabs>
      </el-tab-pane>

      <!--香港特别行政区-->
      <el-tab-pane>
        <span slot="label"><i class="el-icon-location-outline"></i>香港特别行政区</span>
        <el-tabs :tab-position="tabPosition2" class="tabPosition2">
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>东区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>南区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>湾仔区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>中西区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>观塘区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>黄大仙区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>九龙城区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>深水埗区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>油尖旺区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>北区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>大埔区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>葵青区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>离岛区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>荃湾区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>沙田区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>屯门区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>西贡区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>元朗区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
        </el-tabs>
      </el-tab-pane>

      <!--澳门特别行政区-->
      <el-tab-pane>
        <span slot="label"><i class="el-icon-location-outline"></i>澳门特别行政区</span>
        <el-tabs :tab-position="tabPosition2" class="tabPosition2">
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>大堂区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>风顺堂区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>花地玛堂区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>圣安多尼堂区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>望德堂区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>嘉模堂区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>圣方济各堂区</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>路氹城</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
        </el-tabs>
      </el-tab-pane>

      <!--台湾省-->
      <el-tab-pane>
        <span slot="label"><i class="el-icon-location-outline"></i>台湾省</span>
        <el-tabs :tab-position="tabPosition2" class="tabPosition2">
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>高雄市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>台北市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>台南市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>台中市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>桃园市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>新北市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>基隆市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>嘉义市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>新竹市</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>花莲县</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>嘉义县</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>金门县</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>连江县（马祖）</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>苗栗县</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>南投县</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>澎湖县</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>屏东县</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>台东县</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>新竹县</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>宜兰县</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>云林县</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
          <el-tab-pane>
            <span slot="label"><i class="el-icon-location-outline"></i>彰化县</span>
            <el-scrollbar>
              <el-collapse
                v-model="activeNames"
                @change="handleChange"
                class="address_collapse"
                v-for="(item, index) in collapseList"
                :key="index"
                :name="index">
                <el-collapse-item
                  v-for="(item2, index2) in collapseList2"
                  :key="index2"
                  :name="index2">
                  <span slot="title">重点地区：{{ item.address }}</span>
                  <div>次要重点路径：{{ item2.address2 }}</div>
                </el-collapse-item>
              </el-collapse>
            </el-scrollbar>
          </el-tab-pane>
        </el-tabs>
      </el-tab-pane>

    </el-tabs>
  </div>
</template>

<script>
  export default {
    name: "KeyRoad",
    data(){
      return{
        tabPosition: 'left',
        tabPosition2:'left',
        activeNames:'',
        collapseList:[
          {
            address:'福建省福州市晋安区'
          }
        ],
        collapseList2: [
          {
            address2:'福建省福州市晋安区'
          }
        ]
      }
    },
    methods: {
      handleChange(val) {
        console.log(val);
      }
    }
  }
</script>

<style scoped>
  .keyroad_container{
    height: 100%;
    width: 100%;
  }
  .tabPosition{
    height: 720px;
  }
  .tabPosition2{
    height: 720px;
  }
  .address_collapse{
    height: 720px;
  }
</style>
