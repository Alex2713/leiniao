package com.leiniao.server.data.base.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * api请求内容体统一封装entity
 * @author 胡伟龙
 * @param <T> 对象类型
 */
@Data
@ApiModel(value = "通用数据响应对象")
public class Result<T> implements Serializable {
    /**
     * 构造函数
     */
    private Result() {}

    /**
     * 响应码
     */
    @ApiModelProperty(value = "响应码", required = true, example = "200")
    private Integer state;

    /**
     * 时间戳
     */
    @ApiModelProperty(value = "时间戳", required = true, example = "1567425139000")
    private Long time;

    /**
     * 响应信息
     */
    @ApiModelProperty(value = "响应信息", required = true, example = "SUCCESS")
    private String message;

    /**
     * 响应数据
     */
    @ApiModelProperty(value = "响应数据", required = false, example = "")
    private T content;

    /**
     * 构造函数
     * @param state 响应码
     * @param message 响应信息
     * @param content 响应数据
     */
    public Result(Integer state, String message, T content) {
        this.state = state;
        this.message = message;
        this.content = content;
        this.time = System.currentTimeMillis();
    }

    /**
     * SUCCESS
     * @param <T> 响应类型
     * @return 响应结果
     */
    public static <T> Result<T> success() {
        MsgEnum resultsMsg = MsgEnum.OK;
        return new Result<>(resultsMsg.getState(), resultsMsg.getMessage(), null);
    }

    /**
     * SUCCESS
     * @param message 响应信息
     * @param <T> 响应类型
     * @return 响应结果
     */
    public static <T> Result<T> success(String message) {
        MsgEnum resultsMsg = MsgEnum.OK;
        return new Result<>(resultsMsg.getState(), message, null);
    }

    /**
     * SUCCESS
     * @param content 响应数据
     * @param <T> 响应类型
     * @return 响应结果
     */
    public static <T> Result<T> success(T content) {
        MsgEnum resultsMsg = MsgEnum.OK;
        return new Result<>(resultsMsg.getState(), resultsMsg.getMessage(), content);
    }

    /**
     * SUCCESS
     * @param message 响应信息
     * @param content 响应数据
     * @param <T> 响应类型
     * @return 响应结果
     */
    public static <T> Result<T> success(String message, T content) {
        MsgEnum resultsMsg = MsgEnum.OK;
        return new Result<>(resultsMsg.getState(), message, content);
    }

    /**
     * ERROR
     * @param <T> 响应类型
     * @return 响应结果
     */
    public static <T> Result<T> error() {
        MsgEnum resultsMsg = MsgEnum.SEVER_ERROR;
        return new Result<>(resultsMsg.getState(), resultsMsg.getMessage(), null);
    }

    /**
     * ERROR
     * @param message 响应信息
     * @param <T> 响应类型
     * @return 响应结果
     */
    public static <T> Result<T> error(String message) {
        MsgEnum resultsMsg = MsgEnum.SEVER_ERROR;
        return new Result<>(resultsMsg.getState(), message, null);
    }

    /**
     * ERROR
     * @param content 响应数据
     * @param <T> 响应类型
     * @return 响应结果
     */
    public static <T> Result<T> error(T content) {
        MsgEnum resultsMsg = MsgEnum.SEVER_ERROR;
        return new Result<>(resultsMsg.getState(), resultsMsg.getMessage(), content);
    }

    /**
     * ERROR
     * @param state 结果码
     * @param message 响应信息
     * @param <T> 响应类型
     * @return 响应结果
     */
    public static <T> Result<T> error(Integer state, String message) {
        MsgEnum resultsMsg = MsgEnum.SEVER_ERROR;
        return new Result<>(state, message, null);
    }

    /**
     * ERROR
     * @param message 响应信息
     * @param content 响应数据
     * @param <T> 响应类型
     * @return 响应结果
     */
    public static <T> Result<T> error(String message, T content) {
        MsgEnum resultsMsg = MsgEnum.SEVER_ERROR;
        return new Result<>(resultsMsg.getState(), message, content);
    }

    /**
     * RESULT
     * @param resultsMsg 结果信息
     * @param <T> 结果类型
     * @return 响应结果
     */
    public static <T> Result<T> result(MsgEnum resultsMsg) {
        return new Result<>(resultsMsg.getState(), resultsMsg.getMessage(), null);
    }

    /**
     * RESULT
     * @param state 响应码
     * @param message 响应信息
     * @param content 响应数据
     * @param <T> 响应类型
     * @return 响应结果
     */
    public static <T> Result<T> result(Integer state, String message, T content) {
        return new Result<>(state, message, content);
    }

    /**
     * 判断响应结果是否成功
     * @param results  响应结果
     * @param <T> 响应类型
     * @return true 成功 false 失败
     */
    public static <T> boolean isSuccess(Result<T> results) {
        if (results == null) {
            return false;
        }
        return MsgEnum.OK.getState().equals(results.getState());
    }
}
