package com.mcb.immail.product;

import com.mcb.immail.product.entity.BrandEntity;
import com.mcb.immail.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ImmailProductApplicationTests {

	@Autowired
	BrandService brandService;

	@Test
	void contextLoads() {
		BrandEntity entity = new BrandEntity();
		entity.setName("华为");
		brandService.save(entity);
		System.out.println("保存成功");
	}

}
