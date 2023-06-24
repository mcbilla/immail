package com.mcb.immail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mcb.immail.common.utils.PageUtils;
import com.mcb.immail.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author mcb
 * @email mcb9141018@outlook.com
 * @date 2023-06-24 23:40:08
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

