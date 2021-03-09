package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.pms.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author ÁõÎÄÐù
 * @email lwx991113@163.com
 * @date 2021-03-08 21:17:35
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

