package com.atguigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.ums.entity.UndoLogEntity;

/**
 * 
 *
 * @author lwx
 * @email lwx991113@163.com
 * @date 2021-03-26 13:27:26
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

