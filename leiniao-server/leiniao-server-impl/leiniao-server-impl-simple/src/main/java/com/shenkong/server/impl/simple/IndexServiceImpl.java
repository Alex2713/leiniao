package com.shenkong.server.impl.simple;

import com.leiniao.server.impl.base.BaseServiceImpl;
import com.leiniao.server.service.base.IndexService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

/**
 * demo测试服务接口实现
 * @author Alex
 */
@Slf4j
@RestController
public class IndexServiceImpl extends BaseServiceImpl implements IndexService {
    @Value("${test: 1}")
    private String test;

    @Value("${test2: 2}")
    private String test2;

    @Value("${a1: 1}")
    private String a1;

    @Value("${a2: 2}")
    private String a2;

    /**
     * 默认页面
     * @return
     */
    @Override
    public String index() {
        System.out.println("test:" + test);
        System.out.println("test2:" + test2);
        System.out.println("a1:" + a1);
        System.out.println("a2:" + a2);
        return "Hello World Index";
    }
}
