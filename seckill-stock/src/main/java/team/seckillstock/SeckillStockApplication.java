package team.seckillstock;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("team.seckillstock.mapper")
public class SeckillStockApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeckillStockApplication.class, args);
    }

}
