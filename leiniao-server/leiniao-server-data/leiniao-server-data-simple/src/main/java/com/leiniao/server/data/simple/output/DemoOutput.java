package com.leiniao.server.data.simple.output;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * demo输出结果
 * @author 胡伟龙
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "demo输出结果")
public class DemoOutput implements Serializable {
    /**
     * id
     */
    @ApiModelProperty(value = "id", required = true, example = "1")
    private Long id;

    /**
     * 名称
     */
    @ApiModelProperty(value = "名称", required = true, example = "Alex")
    private String name;
}
