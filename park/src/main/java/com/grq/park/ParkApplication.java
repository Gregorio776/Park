package com.grq.park;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.grq.park.mapper"})
public class ParkApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParkApplication.class, args);
    }

}
