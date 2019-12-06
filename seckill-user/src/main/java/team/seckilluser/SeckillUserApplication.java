package team.seckilluser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("team.seckilluser.mapper")
public class SeckillUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeckillUserApplication.class, args);
    }

}
