package com.leiniao.server.impl.config;

import com.leiniao.server.data.base.result.Result;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常捕获
 * @author 胡伟龙
 */
@RestControllerAdvice
public class BaseExceptionHandler {
    /**
     * Validated 验证异常处理逻辑
     * @param e 异常信息
     * @return 错误信息
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public Result<String> exception(MethodArgumentNotValidException e) {
        ObjectError objectError = e.getBindingResult().getAllErrors().get(0);
        return Result.error(objectError.getDefaultMessage());
    }

    /**
     * 运行时异常处理逻辑
     * @param e 异常信息
     * @return 错误信息
     */
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Result<String> exception(RuntimeException e){
        return Result.error(e.getMessage());
    }

    /**
     * Valid 验证异常处理逻辑
     * @param e 异常信息
     * @return 错误信息
     */
    @ExceptionHandler(BindException.class)
    @ResponseBody
    public Result<String> exception(BindException e){
        return Result.error(e.getMessage());
    }

    /**
     * 其它处理逻辑
     * @param e 异常信息
     * @return 错误信息
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result<String> exception(Exception e){
        return Result.error(e.getMessage());
    }
}
