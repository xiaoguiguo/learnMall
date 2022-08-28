package com.ddj.learnmall.coupon.dao;

import com.ddj.learnmall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author ddj
 * @email varuscn@gmail.com
 * @date 2022-08-28 23:07:19
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
