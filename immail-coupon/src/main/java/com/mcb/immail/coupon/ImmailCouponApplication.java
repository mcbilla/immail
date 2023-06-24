package com.mcb.immail.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.mcb.immail.coupon.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class ImmailCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImmailCouponApplication.class, args);
    }

}
