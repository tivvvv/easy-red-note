package com.tiv.user.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户地址DO
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("user_address")
public class UserAddressDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户收货地址id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 是否默认收货地址
     */
    private Boolean defaultStatus;

    /**
     * 收货人姓名
     */
    private String receiverName;

    /**
     * 收货人电话
     */
    private String phone;

    /**
     * 省/直辖市
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String region;

    /**
     * 详细地址
     */
    private String detailAddress;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
