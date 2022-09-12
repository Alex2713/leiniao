package com.leiniao.server.data.base.result;

import com.leiniao.common.core.constant.BaseConstants;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@AllArgsConstructor
@Getter
public enum MsgEnum {
    /**
     * 200 OK。
     * 请求已成功执行，回应内容取决于所调用的动词
     */
    OK(BaseConstants.SUCCESS, BaseConstants.SUCCESS_MSG),

    /**
     * 500 内部服务器错误
     */
    SEVER_ERROR(BaseConstants.FAIL, BaseConstants.FAIL_MSG),
    ;

    /**
     * 返回状态
     */
    private Integer state;

    /**
     * 返回消息
     */
    private String message;

    public static MsgEnum getByCode(String state) {
        return Arrays.stream(MsgEnum.values()).filter(a -> a.getState().equals(state)).findFirst().orElse(null);
    }
}
