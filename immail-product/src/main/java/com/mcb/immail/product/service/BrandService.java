package com.mcb.immail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mcb.immail.common.utils.PageUtils;
import com.mcb.immail.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author mcb
 * @email mcb9141018@outlook.com
 * @date 2023-06-24 21:55:26
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

