package com.tiv.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 统一业务状态码枚举类
 */
@Getter
@AllArgsConstructor
public enum BizCodeEnum {

    /**
     * 用户微服务操作码1xxx
     */
    // 登录相关 10xx
    USER_PHONE_ERROR(1001, "手机号不合法"),
    USER_CODE_FAST(1002, "验证码发送太快了"),
    USER_CODE_PHONE_ERROR(1003, "手机验证码错误"),
    USER_CODE_CAPTCHA_ERROR(1004, "图形验证码错误"),
    USER_CODE_EMAIL_ERROR(1005, "邮箱验证码错误"),

    // 账号相关 11xx
    USER_ACCOUNT_EXIST(1101, "用户账号已存在"),
    USER_ACCOUNT_PWD_ERROR(1102, "用户账号或密码错误"),
    USER_ACCOUNT_NOT_LOGIN(1103, "用户账号未登录"),
    USER_ACCOUNT_NOT_EXIST(1104, "用户账号不存在"),
    USER_LOGIN_SUCCESS(1105, "用户登录成功"),

    // 修改信息相关 12xx
    USER_PHONE_UPDATE_ERROR(1201, "用户手机号修改失败"),
    USER_AVATAR_UPLOAD_ERROR(1202, "用户头像上传失败"),

    // 收货地址相关 13xx
    USER_ADDRESS_NOT_EXITS(1301, "收货地址不存在"),
    USER_ADDRESS_ADD_ERROR(1302, "新增收货地址失败"),
    USER_ADDRESS_DEL_ERROR(1303, "删除收货地址失败"),
    USER_ADDRESS_UPDATE_ERROR(1304, "修改收货地址失败"),

    // 关注相关 14xx
    USER_FOLLOW_SELF(1401, "不能关注自己哦"),
    USER_ALREADY_FOLLOWED(1402, "已经关注过了哦"),
    USER_ALREADY_UNFOLLOWED(1403, "已经取关过了哦"),
    USER_FOLLOW_SUCCESS(1404, "关注成功"),
    USER_UNFOLLOW_SUCCESS(1405, "取关成功");

    /**
     * 状态码
     */
    private final int code;

    /**
     * 信息
     */
    private final String msg;

}
