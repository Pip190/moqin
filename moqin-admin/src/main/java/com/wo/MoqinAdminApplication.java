package com.wo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wo.mapper")
public class MoqinAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoqinAdminApplication.class, args);
    }

}
