package com.leiniao.common.knife4j.properties;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * swagger 配置文件
 * @author Alex
 */
@Data
public class SwaggerAuthProperties implements Serializable {
    /**
     * 鉴权策略ID，需要和 SecurityReferences ID 保持一致
     */
    private String name = "";

    /**
     * 需要开启鉴权URL的正则
     */
    private String authRegex = "^.*$";

    /**
     * 鉴权作用域列表
     */
    private List<SwaggerAuthScopeProperties> authorizationScopeList;

    /**
     * token 列表
     */
    private List<String> tokenUrlList = new ArrayList<>();
}
