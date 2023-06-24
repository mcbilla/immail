package com.mcb.immail.order.dao;

import com.mcb.immail.order.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author mcb
 * @email mcb9141018@outlook.com
 * @date 2023-06-24 23:30:38
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
