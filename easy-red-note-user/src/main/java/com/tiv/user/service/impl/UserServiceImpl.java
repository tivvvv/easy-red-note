package com.tiv.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiv.user.mapper.UserMapper;
import com.tiv.user.model.UserDO;
import com.tiv.user.service.UserService;
import org.springframework.stereotype.Service;

/**
 * 用户服务实现类
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserService {

}
