package com.atguigu.gmall.sms.mapper;

import com.atguigu.gmall.sms.entity.SeckillSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动商品关联
 * 
 * @author lwx
 * @email lwx991113@163.com
 * @date 2021-03-08 22:48:44
 */
@Mapper
public interface SeckillSkuMapper extends BaseMapper<SeckillSkuEntity> {
	
}
