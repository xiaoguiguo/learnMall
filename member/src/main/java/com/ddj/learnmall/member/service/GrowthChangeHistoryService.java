package com.ddj.learnmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ddj.common.utils.PageUtils;
import com.ddj.learnmall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author ddj
 * @email varuscn@gmail.com
 * @date 2022-08-28 23:11:31
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

