package com.mcb.immail.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.mcb.immail.member.dao")
@SpringBootApplication
public class ImmailMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImmailMemberApplication.class, args);
    }

}
