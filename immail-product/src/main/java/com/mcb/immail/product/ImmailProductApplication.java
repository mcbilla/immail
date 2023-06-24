package com.mcb.immail.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.mcb.immail.product.dao")
@SpringBootApplication
public class ImmailProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImmailProductApplication.class, args);
    }

}
