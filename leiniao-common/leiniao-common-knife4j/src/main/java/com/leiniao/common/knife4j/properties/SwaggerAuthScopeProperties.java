package com.leiniao.common.knife4j.properties;

import lombok.Data;

import java.io.Serializable;

/**
 * swagger 配置文件
 * @author Alex
 */
@Data
public class SwaggerAuthScopeProperties implements Serializable {
    /**
     * 作用域名称
     */
    private String scope = "";

    /**
     * 作用域描述
     */
    private String description = "";
}
