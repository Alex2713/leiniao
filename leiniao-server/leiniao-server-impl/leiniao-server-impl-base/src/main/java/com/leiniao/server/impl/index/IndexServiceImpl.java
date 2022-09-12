package com.leiniao.server.impl.index;

import com.leiniao.server.service.base.IndexService;

/**
 * 首页服务接口
 * @author 胡伟龙
 */
public class IndexServiceImpl implements IndexService {

    /**
     * 默认页面
     * @return
     */
    @Override
    public String index() {
        return "Hello World";
    }
}
