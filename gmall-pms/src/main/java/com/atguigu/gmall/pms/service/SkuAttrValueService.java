package com.atguigu.gmall.pms.service;

import com.atguigu.gmall.pms.vo.SaleAttrValueVo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.pms.entity.SkuAttrValueEntity;

import java.util.List;
import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author ÁõÎÄÐù
 * @email lwx991113@163.com
 * @date 2021-03-08 21:17:35
 */
public interface SkuAttrValueService extends IService<SkuAttrValueEntity> {

    PageResultVo queryPage(PageParamVo paramVo);

    List<SkuAttrValueEntity> querySearchAttrValuesBySkyId(Long cid, Long skuId);

    List<SaleAttrValueVo> querySaleAttrsBySpuId(Long spuId);

    Map<String, Object> querySaleAttrsMappingSkuIdBySpuId(Long spuId);
}

