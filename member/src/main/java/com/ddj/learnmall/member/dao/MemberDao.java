package com.ddj.learnmall.member.dao;

import com.ddj.learnmall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author ddj
 * @email varuscn@gmail.com
 * @date 2022-08-28 23:11:31
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
