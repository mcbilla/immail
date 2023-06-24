package com.mcb.immail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mcb.immail.common.utils.PageUtils;
import com.mcb.immail.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author mcb
 * @email mcb9141018@outlook.com
 * @date 2023-06-24 23:30:38
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

