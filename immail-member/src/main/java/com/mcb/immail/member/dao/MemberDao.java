package com.mcb.immail.member.dao;

import com.mcb.immail.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author mcb
 * @email mcb9141018@outlook.com
 * @date 2023-06-24 23:14:55
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
