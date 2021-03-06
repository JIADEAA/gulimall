package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author jiade
 * @email jiade@gmail.com
 * @date 2022-04-01 20:12:14
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
