package com.mcb.immail.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.mcb.immail.member.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class ImmailMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImmailMemberApplication.class, args);
    }

}
