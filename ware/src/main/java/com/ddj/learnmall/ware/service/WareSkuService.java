package com.ddj.learnmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ddj.common.utils.PageUtils;
import com.ddj.learnmall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author ddj
 * @email varuscn@gmail.com
 * @date 2022-08-28 23:09:06
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

