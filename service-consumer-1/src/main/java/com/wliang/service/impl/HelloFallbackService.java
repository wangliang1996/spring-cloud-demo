package com.wliang.service.impl;

import com.wliang.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author wliang
 * @description Feign 熔断降级策略
 * @date 2022-08-13 11:19
 */
@Component
public class HelloFallbackService implements HelloService {
    @Override
    public String hi(String name) {
        return "Feign Fallback";
    }
}
