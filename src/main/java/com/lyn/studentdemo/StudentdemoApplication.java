package com.lyn.studentdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ComponentScan({"com.lyn"})
//@EnableWebMvc
@SpringBootApplication
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.lyn")
@EntityScan(basePackages = "com.lyn")
public class StudentdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentdemoApplication.class, args);
    }
}
