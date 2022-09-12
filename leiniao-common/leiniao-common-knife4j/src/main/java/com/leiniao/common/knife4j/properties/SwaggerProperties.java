package com.leiniao.common.knife4j.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * swagger 配置文件
 * @author Alex
 */
@Data
@Component
@ConfigurationProperties(prefix = "swagger")
public class SwaggerProperties implements Serializable {
    /**
     * swagger会解析的包路径
     **/
    private String basePackage = "";

    /**
     * 标题
     **/
    private String title = "";

    /**
     * 描述
     **/
    private String description = "";

    /**
     * 版本
     **/
    private String version = "";

    /**
     * 许可证
     **/
    private String license = "";

    /**
     * 许可证URL
     **/
    private String licenseUrl = "";

    /**
     * 服务条款URL
     **/
    private String termsOfServiceUrl = "";

    /**
     * host信息
     **/
    private String host = "";

    /**
     * swagger会解析的url规则
     **/
    private List<String> basePath = new ArrayList<>();

    /**
     * 在basePath基础上需要排除的url规则
     **/
    private List<String> excludePath = new ArrayList<>();

    /**
     * 联系人信息
     */
    private SwaggerContactProperties contact;

    /**
     * 全局统一鉴权配置
     **/
    private SwaggerAuthProperties authorization;
}
