package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author jiade
 * @email jiade@gmail.com
 * @date 2022-04-01 13:30:24
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
