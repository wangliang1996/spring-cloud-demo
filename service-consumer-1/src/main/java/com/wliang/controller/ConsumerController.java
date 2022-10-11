package com.wliang.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.wliang.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wliang
 * @description TODO
 * @date 2022-08-09 21:01
 */
@RestController
public class ConsumerController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/hi-feign")
    @SentinelResource(value = "hiFeign",blockHandler = "handleHiException")
    public String hiFeign(){
        return helloService.hi("Lin");
    }

    @GetMapping("/hi-feign-fallback")
    public String hiFeignFallback(){
        return helloService.hi("sentinelFallback");
    }

    public String handleHiException(BlockException e){
        return "handleHiException";
    }
}
