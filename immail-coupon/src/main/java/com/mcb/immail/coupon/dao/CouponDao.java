package com.mcb.immail.coupon.dao;

import com.mcb.immail.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author mcb
 * @email mcb9141018@outlook.com
 * @date 2023-06-24 22:59:37
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
