package com.ddj.learnmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ddj.common.utils.PageUtils;
import com.ddj.learnmall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author ddj
 * @email varuscn@gmail.com
 * @date 2022-08-28 23:07:19
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

