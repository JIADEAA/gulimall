package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.SkuLadderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品阶梯价格
 * 
 * @author jiade
 * @email jiade@gmail.com
 * @date 2022-04-01 14:41:35
 */
@Mapper
public interface SkuLadderDao extends BaseMapper<SkuLadderEntity> {
	
}