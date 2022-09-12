package com.leiniao.server.service.base;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页服务接口
 * @author 胡伟龙
 */
@Api(tags = "首页服务接口")
@RequestMapping("/")
public interface IndexService {
    /**
     * 默认页面
     * @return 返回结果
     */
    @GetMapping("/")
    @ApiOperation(value = "默认页面", notes = "首页默认页面")
    public String index();
}
