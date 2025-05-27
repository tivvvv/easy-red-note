DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`
(
    `id`          bigint(0)    NOT NULL AUTO_INCREMENT COMMENT '用户id',
    `name`        varchar(32)  NOT NULL COMMENT '用户昵称',
    `pwd`         varchar(64)  NULL     DEFAULT NULL COMMENT '用户密码',
    `avatar`      varchar(255) NULL     DEFAULT NULL COMMENT '用户头像',
    `sex`         tinyint(1)   NOT NULL DEFAULT 2 COMMENT '性别',
    `points`      int(0)       NOT NULL DEFAULT 0 COMMENT '用户积分',
    `phone`       varchar(11)  NOT NULL COMMENT '用户手机号',
    `mail`        varchar(64)  NULL     DEFAULT NULL COMMENT '用户邮箱',
    `secret`      varchar(12)  NULL     DEFAULT NULL COMMENT '用来个人敏感信息处理',
    `create_time` datetime(0)  NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
    `update_time` datetime(0)  NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
    PRIMARY KEY (`id`),
    UNIQUE INDEX `uq_phone` (`phone`)
) COMMENT = '用户表';

DROP TABLE IF EXISTS `user_address`;
CREATE TABLE `user_address`
(
    `id`             bigint(0)    NOT NULL AUTO_INCREMENT COMMENT '用户收货地址id',
    `user_id`        bigint(0)    NOT NULL COMMENT '用户id',
    `default_status` tinyint(1)   NOT NULL DEFAULT 0 COMMENT '是否默认收货地址',
    `receiver_name`  varchar(64)  NULL     DEFAULT NULL COMMENT '收货人姓名',
    `phone`          varchar(64)  NULL     DEFAULT NULL COMMENT '收货人电话',
    `province`       varchar(64)  NULL     DEFAULT NULL COMMENT '省/直辖市',
    `city`           varchar(64)  NULL     DEFAULT NULL COMMENT '市',
    `region`         varchar(64)  NULL     DEFAULT NULL COMMENT '区',
    `detail_address` varchar(255) NULL     DEFAULT NULL COMMENT '详细地址',
    `create_time`    datetime(0)  NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
    `update_time`    datetime(0)  NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
    PRIMARY KEY (`id`),
    INDEX `idx_user` (`user_id`)
) COMMENT = '用户收货地址表';
