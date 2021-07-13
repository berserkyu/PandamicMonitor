//package grp.pandemicmonitor.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
////跨域配置类
//@Configuration
//
//public class CrosConfig implements WebMvcConfigurer{
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")//访问的任何东西都允许跨域
//                .allowedOrigins("*")//请求来源
//                .allowedMethods("GET","HEAD","POST","DELETE","OPTIONS","PUT")
//                .allowCredentials(true)
//                .maxAge(3600)
//                .allowedHeaders("*");
//    }
//}
