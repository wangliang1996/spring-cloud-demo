package com.wliang.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wliang
 * @description TODO
 * @date 2022-08-09 21:02
 */
@FeignClient(value = "service-provider-1")
public interface HelloService {
    @GetMapping("/hi")
    String hi(@RequestParam(value = "name", defaultValue = "consumer", required = false) String name);
}
