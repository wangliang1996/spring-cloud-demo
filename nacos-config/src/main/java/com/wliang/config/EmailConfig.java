package com.wliang.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author wliang
 * @description 邮箱配置
 * @date 2022-08-11 19:29
 */
@Data
@Component
@RefreshScope
@ConfigurationProperties(prefix = "email")
public class EmailConfig {
    private String url;

    private String username;

    private String password;
}
