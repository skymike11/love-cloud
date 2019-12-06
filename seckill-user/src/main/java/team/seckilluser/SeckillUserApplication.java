package team.seckilluser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages={"team.seckilluser.mapper"})
public class SeckillUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeckillUserApplication.class, args);
    }

}
