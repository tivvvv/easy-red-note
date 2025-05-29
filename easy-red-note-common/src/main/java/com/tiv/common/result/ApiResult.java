package com.tiv.common.result;

import com.tiv.common.enums.BizCodeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * 统一接口响应类
 */
@Data
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
public class ApiResult {

    /**
     * 接口响应状态码 0:成功 其他:失败
     */
    private Integer code;

    /**
     * 数据
     */
    private Object data;

    /**
     * 描述
     */
    private String msg;

    /**
     * 成功响应
     *
     * @return
     */
    public static ApiResult doSuccess() {
        return new ApiResult(0, null, "成功");
    }

    /**
     * 成功响应
     *
     * @param data
     * @return
     */
    public static ApiResult doSuccess(Object data) {
        return new ApiResult(0, data, "成功");
    }

    /**
     * 失败响应
     *
     * @param code
     * @return
     */
    public static ApiResult doError(Integer code, String msg) {
        return new ApiResult(code, null, msg);
    }

    /**
     * 通过枚举返回
     *
     * @param bizCodeEnum
     * @return
     */
    public static ApiResult doResult(BizCodeEnum bizCodeEnum) {
        return new ApiResult(bizCodeEnum.getCode(), null, bizCodeEnum.getMsg());
    }

}
