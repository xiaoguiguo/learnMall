package com.ddj.learnmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ddj.common.utils.PageUtils;
import com.ddj.learnmall.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author ddj
 * @email varuscn@gmail.com
 * @date 2022-08-28 23:11:30
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

