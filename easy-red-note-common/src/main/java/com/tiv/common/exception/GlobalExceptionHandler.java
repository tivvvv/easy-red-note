package com.tiv.common.exception;

import com.tiv.common.result.ApiResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public ApiResult handle(Exception e) {
        // 判断是业务异常还是非业务异常
        if (e instanceof BizException bizException) {
            log.error("业务异常信息: ", e);
            return ApiResult.doError(bizException.getCode(), bizException.getMessage());
        } else {
            log.info("系统异常信息: ", e);
            return ApiResult.doError(HttpStatus.INTERNAL_SERVER_ERROR.value(), "系统异常: " + e);
        }
    }

}
