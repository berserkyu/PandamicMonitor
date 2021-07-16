<template>
  <div>
    <!-- 这是生成二维码的代码
    <qr-code text="PandemicMonitorLoc1000"></qr-code>
    -->
    <!--扫描二维码-->
    <qrcode-stream @decode="onDecode"></qrcode-stream>
  </div>


</template>
<script>

export default {
  methods:{
    onDecode (decodedString) {
      console.log(decodedString);
    }
  }

}

</script>
