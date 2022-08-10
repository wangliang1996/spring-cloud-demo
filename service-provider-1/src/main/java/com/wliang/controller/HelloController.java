package com.wliang.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wliang
 * @description TODO
 * @date 2022-08-09 20:15
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/hi")
    public String hi(@RequestParam(value = "name", defaultValue = "provider-1", required = false) String name) {
        return "hi " + name + " i'm service provider 1,my port: " + port;
    }
}
