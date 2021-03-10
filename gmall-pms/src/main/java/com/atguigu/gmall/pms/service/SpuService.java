package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.pms.entity.SpuEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author ÁõÎÄÐù
 * @email lwx991113@163.com
 * @date 2021-03-08 21:17:35
 */
public interface SpuService extends IService<SpuEntity> {

    PageResultVo queryPage(PageParamVo paramVo);


    PageResultVo querySpuByCidOrKeyPage(PageParamVo paramVo, Long cid);
}

