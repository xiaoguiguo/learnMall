package com.ddj.learnmall.order.dao;

import com.ddj.learnmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author ddj
 * @email varuscn@gmail.com
 * @date 2022-08-28 23:03:20
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
