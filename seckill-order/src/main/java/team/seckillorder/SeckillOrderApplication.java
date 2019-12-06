package team.seckillorder;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("team.seckillorder.mapper")
public class SeckillOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(SeckillOrderApplication.class, args);
    }
}
