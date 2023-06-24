package com.mcb.immail.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.mcb.immail.ware.dao")
@SpringBootApplication
public class ImmailWareApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImmailWareApplication.class, args);
	}

}
