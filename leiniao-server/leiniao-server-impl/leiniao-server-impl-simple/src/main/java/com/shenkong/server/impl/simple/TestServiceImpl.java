package com.shenkong.server.impl.simple;

import cn.hutool.core.util.IdUtil;
import com.leiniao.server.data.simple.input.DemoInput;
import com.leiniao.server.data.simple.output.DemoOutput;
import com.leiniao.server.impl.base.BaseServiceImpl;
import com.leiniao.server.service.simple.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * demo测试服务接口实现
 * @author Alex
 */
@Slf4j
@RestController
public class TestServiceImpl extends BaseServiceImpl implements TestService {
    /**
     * 查询demo数据列表
     * @return 返回结果
     */
    @Override
    public List<DemoOutput> list() {
        List<DemoOutput> list = new ArrayList<>();
        list.add(new DemoOutput(1L, IdUtil.fastSimpleUUID()));
        list.add(new DemoOutput(2L, IdUtil.fastSimpleUUID()));
        list.add(new DemoOutput(3L, IdUtil.fastSimpleUUID()));
        list.add(new DemoOutput(4L, IdUtil.fastSimpleUUID()));
        return list;
    }

    /**
     * 查询demo数据详情
     * @param id 编号
     * @return 返回结果
     */
    @Override
    public DemoOutput get(Long id) {
        return new DemoOutput(id, IdUtil.fastSimpleUUID());
    }

    /**
     * 统计demo数量
     * @return 返回结果
     */
    @Override
    public Long count() {
        return 5L;
    }

    /**
     * 新增demo数据
     * @param demoInput 参数
     * @return 返回结果
     */
    @Override
    public Boolean add(DemoInput demoInput) {
        return true;
    }

    /**
     * 修改demo数据
     * @param demoInput 参数
     * @return 返回结果
     */
    @Override
    public Boolean update(DemoInput demoInput) {
        return true;
    }

    /**
     * 删除demo数据
     * @param id 编号
     * @return 返回结果
     */
    @Override
    public Boolean del(Long id) {
        return true;
    }
}
