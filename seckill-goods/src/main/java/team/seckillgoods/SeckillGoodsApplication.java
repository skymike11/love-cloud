package team.seckillgoods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages={"team.seckillgoods.mapper"})
public class SeckillGoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeckillGoodsApplication.class, args);
    }

}
