package com.tiv.common.exception;

import com.tiv.common.enums.BizCodeEnum;
import lombok.Getter;

/**
 * 统一业务异常类
 */
@Getter
public class BizException extends RuntimeException {

    /**
     * 默认错误码
     */
    private static final int DEFAULT_ERROR_CODE = -1;

    /**
     * 异常code码
     */
    private final int code;

    /**
     * 异常消息
     */
    private final String msg;

    /**
     * 根据code,message返回异常信息
     *
     * @param code
     * @param msg
     */
    public BizException(int code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    /**
     * 根据BizCodeEnum返回异常信息
     */
    public BizException(BizCodeEnum bizCodeEnum) {
        super(bizCodeEnum.getMsg());
        this.code = bizCodeEnum.getCode();
        this.msg = bizCodeEnum.getMsg();
    }


    /**
     * 根据errorMsg返回异常信息
     *
     * @param errorMsg
     */
    public BizException(String errorMsg) {
        super(errorMsg);
        this.code = DEFAULT_ERROR_CODE;
        this.msg = errorMsg;
    }

}
