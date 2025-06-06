package com.tiv.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiv.user.mapper.UserAddressMapper;
import com.tiv.user.model.UserAddressDO;
import com.tiv.user.service.UserAddressService;
import org.springframework.stereotype.Service;

/**
 * 用户地址服务实现类
 */
@Service
public class UserAddressServiceImpl extends ServiceImpl<UserAddressMapper, UserAddressDO> implements UserAddressService {

}
