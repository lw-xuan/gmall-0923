package com.atguigu.gmall.search.pojo;

import io.swagger.models.auth.In;
import lombok.Data;

import java.util.List;

@Data
public class SearchParamVo {

    // 搜索关键字
    private String keyword;
    // 品牌的过滤条件
    private List<Long> brandId;
    // 分类的过滤条件
    private List<Long> cid;
    // 规格参数的过滤条件: ["4:8G-12G", "5:256G-512G"]
    private List<String> props;
    // 排序字段：0或者默认-得分降序  1-价格降序 2-价格升序 3-新品降序 4-销量降序
    private Integer sort;

    // 价格区间过滤
    private Double priceFrom;
    private Double priceTo;

    // 是否有货
    private Boolean store;

    // 分页
    private Integer pageNum = 1;
    private final Integer pageSize = 20;
}
