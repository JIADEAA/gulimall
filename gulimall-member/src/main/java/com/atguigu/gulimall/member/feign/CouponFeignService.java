package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author JIADE
 * @description CouponFeignService
 * @date 2022/4/4 18:32
 */
@FeignClient(name="gulimall-coupon", url = "http://localhost:7000/")
@Component
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}
