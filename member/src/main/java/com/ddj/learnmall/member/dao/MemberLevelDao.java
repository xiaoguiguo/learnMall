package com.ddj.learnmall.member.dao;

import com.ddj.learnmall.member.entity.MemberLevelEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员等级
 * 
 * @author ddj
 * @email varuscn@gmail.com
 * @date 2022-08-28 23:11:30
 */
@Mapper
public interface MemberLevelDao extends BaseMapper<MemberLevelEntity> {
	
}
