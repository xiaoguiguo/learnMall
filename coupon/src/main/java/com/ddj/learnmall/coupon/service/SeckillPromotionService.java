package com.ddj.learnmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ddj.common.utils.PageUtils;
import com.ddj.learnmall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author ddj
 * @email varuscn@gmail.com
 * @date 2022-08-28 23:07:19
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

