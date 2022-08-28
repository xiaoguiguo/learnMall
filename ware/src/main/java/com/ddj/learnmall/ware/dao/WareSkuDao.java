package com.ddj.learnmall.ware.dao;

import com.ddj.learnmall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author ddj
 * @email varuscn@gmail.com
 * @date 2022-08-28 23:09:06
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
