package com.leiniao.server.service.simple;

import com.leiniao.server.data.simple.input.DemoInput;
import com.leiniao.server.data.simple.output.DemoOutput;
import com.leiniao.server.service.base.BaseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * demo测试服务接口
 * @author 胡伟龙
 */
@RequestMapping("/demo/test")
@Api(tags = "demo测试服务接口")
public interface TestService extends BaseService {

    /**
     * 查询demo数据列表
     * @return 返回结果
     */
    @GetMapping
    @ApiOperation(value = "查询demo数据列表", notes = "查询demo数据列表")
    public List<DemoOutput> list();

    /**
     * 查询demo数据详情
     * @param id 编号
     * @return 返回结果
     */
    @GetMapping("/{id}")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "id", value = "编号", required = true, dataType = "int", paramType = "path", example = "1")
    )
    @ApiOperation(value = "查询demo数据详情", notes = "查询demo数据详情")
    public DemoOutput get(@PathVariable Long id);

    /**
     * 统计demo数量
     * @return 返回结果
     */
    @GetMapping("/count")
    @ApiOperation(value = "统计demo数量", notes = "统计demo数量")
    public Long count();

    /**
     * 新增demo数据
     * @param demoInput 参数
     * @return 返回结果
     */
    @PostMapping
    @ApiOperation(value = "新增demo数据", notes = "新增demo数据")
    public Boolean add(@RequestBody @Validated DemoInput demoInput);

    /**
     * 修改demo数据
     * @param demoInput 参数
     * @return 返回结果
     */
    @PutMapping
    @ApiOperation(value = "修改demo数据", notes = "修改demo数据")
    public Boolean update(@RequestBody @Validated DemoInput demoInput);

    /**
     * 删除demo数据
     * @param id 编号
     * @return 返回结果
     */
    @DeleteMapping("/{id}")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "id", value = "编号", required = true, dataType = "int", paramType = "path", example = "1")
    )
    @ApiOperation(value = "删除demo数据", notes = "删除demo数据")
    public Boolean del(@PathVariable Long id);
}
