package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.sms.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author lwx
 * @email lwx991113@163.com
 * @date 2021-03-08 22:48:44
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

