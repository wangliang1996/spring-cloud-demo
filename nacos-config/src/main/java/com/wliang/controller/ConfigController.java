package com.wliang.controller;

import com.wliang.config.EmailConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wliang
 * @description TODO
 * @date 2022-08-11 19:33
 */
@RestController
public class ConfigController {

    @Autowired
    private EmailConfig emailConfig;

    @GetMapping("/emailUrl")
    public String emailUrl(){
        return emailConfig.getUrl();
    }
}
