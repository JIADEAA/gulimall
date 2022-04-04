package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author JIADE
 * @description GulimallProductApplicationTest
 * @date 2022/4/1 13:54
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class GulimallProductApplicationTest {
    @Autowired
    BrandService brandService;

    @Test
    public void test01(){
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("sdsad");
        brandService.save(brandEntity);
    }

}
