package com.leiniao.server.data.simple.input;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * demo输入请求参数
 * @author 胡伟龙
 */
@Data
@ApiModel(value = "demo输入请求参数")
public class DemoInput implements Serializable {
    /**
     * id
     */
    @NotNull(message = "id不能为空")
    @ApiModelProperty(value = "id",name = "id",required = true, example = "1")
    private Long id;

    /**
     * 名称
     */
    @NotNull(message = "名称不能为空")
    @ApiModelProperty(value = "名称", required = true, example = "Alex")
    private String name;
}
