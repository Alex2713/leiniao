package com.leiniao.common.knife4j.properties;

import lombok.Data;

import java.io.Serializable;

/**
 * swagger 配置文件
 * @author Alex
 */
@Data
public class SwaggerContactProperties implements Serializable {
    /**
     * 联系人
     **/
    private String name = "";

    /**
     * 联系人 url
     **/
    private String url = "";

    /**
     * 联系人 email
     **/
    private String email = "";
}
