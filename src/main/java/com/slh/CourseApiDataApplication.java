package com.slh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()
@ComponentScan("com.slh")
public class CourseApiDataApplication {

    public static void main(String[] args) {


        SpringApplication.run(CourseApiDataApplication.class, args);


    }

}
