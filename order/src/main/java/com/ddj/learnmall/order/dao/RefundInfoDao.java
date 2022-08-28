package com.ddj.learnmall.order.dao;

import com.ddj.learnmall.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author ddj
 * @email varuscn@gmail.com
 * @date 2022-08-28 23:03:20
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
