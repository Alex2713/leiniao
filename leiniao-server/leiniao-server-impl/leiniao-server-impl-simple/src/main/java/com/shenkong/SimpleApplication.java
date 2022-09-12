package com.shenkong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * 服务模块 - 示例服务模块
 * @author Alex
 */
@RefreshScope
@SpringBootApplication
@EnableDiscoveryClient
public class SimpleApplication {
    public static void main(String[] args) {
        // Spring Boot快速启动程序
        SpringApplication.run(SimpleApplication.class, args);
    }
}
