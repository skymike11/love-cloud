package team.seckillgoods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages={"team.seckillgoods.mapper"})
public class SeckillGoodsApplication {
    public static void main(String[] args) {
        SpringApplication.run(SeckillGoodsApplication.class, args);
    }

}
