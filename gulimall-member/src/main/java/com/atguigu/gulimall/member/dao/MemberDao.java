package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author jiade
 * @email jiade@gmail.com
 * @date 2022-04-01 20:01:35
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
