package com.mcb.immail.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.mcb.immail.coupon.dao")
@SpringBootApplication
public class ImmailCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImmailCouponApplication.class, args);
    }

}
