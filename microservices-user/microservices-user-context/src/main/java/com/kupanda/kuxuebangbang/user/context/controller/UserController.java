package com.kupanda.kuxuebangbang.user.context.controller;

import com.kupanda.kuxuebangbang.user.context.appservice.UserService;
import com.kupanda.kuxuebangbang.user.feign.UserFeignClient;
import com.kupanda.kuxuebangbang.user.feign.domain.UserInfoDto;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *
 **/
@RestController
public class UserController implements UserFeignClient {

    @Resource
    private UserService userService;

    @Override
    public UserInfoDto info(String id) {
        UserInfoDto info = userService.info(id);
        return info;
    }
}
