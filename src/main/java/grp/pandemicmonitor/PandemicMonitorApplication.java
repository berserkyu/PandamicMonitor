package grp.pandemicmonitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class PandemicMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(PandemicMonitorApplication.class, args);
    }

}
