package com.mcb.immail.product.dao;

import com.mcb.immail.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author mcb
 * @email mcb9141018@outlook.com
 * @date 2023-06-24 21:55:26
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
