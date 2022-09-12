package com.leiniao.server.impl.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.leiniao.server.data.base.result.MsgEnum;
import com.leiniao.server.data.base.result.Result;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * 全局响应数据处理
 * @author 胡伟龙
 */
@RestControllerAdvice(basePackages = {"com.shenkong.server"})
public class BaseResponseAdvice implements ResponseBodyAdvice<Object>{

    @Override
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        return !methodParameter.getParameterType().equals(Result.class);
    }

    @Override
    public Object beforeBodyWrite(Object data, MethodParameter methodParameter, MediaType mediaType, Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest request, ServerHttpResponse response) {
        // String类型不能直接包装，所以要进行些特别的处理
        if (methodParameter.getGenericParameterType().equals(String.class)) {
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                // 将数据包装在 Results 里后，再转换为 json 字符串响应给前端
                return objectMapper.writeValueAsString(Result.success(MsgEnum.OK.getMessage(), data));
            } catch (JsonProcessingException e) {
                throw new RuntimeException("返回String类型错误");
            }
        }
        // 将原本的数据包装在 Results 里
        return Result.success(data);
    }
}
