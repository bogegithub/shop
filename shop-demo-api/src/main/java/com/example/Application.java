package com.example;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = "com.example.mapper")
@ComponentScan(basePackages= {"com.example", "org.n3r.idworker"})
@EnableTransactionManagement
//@EnableScheduling
public class   Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
