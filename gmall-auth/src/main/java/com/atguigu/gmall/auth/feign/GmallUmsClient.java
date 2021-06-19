package com.atguigu.gmall.auth.feign;

import org.springframework.cloud.openfeign.FeignClient;
import com.atguigu.gmall.ums.api.GmallUmsApi;

@FeignClient("ums-service")
public interface GmallUmsClient extends GmallUmsApi {
}
