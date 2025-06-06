package com.tiv.user.controller;

import com.tiv.common.result.ApiResult;
import com.tiv.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户Controller
 */
@Api
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation("用户账号详情")
    @GetMapping("{id}")
    public ApiResult userDetail(@PathVariable Long id) {
        return ApiResult.doSuccess();
    }

}

