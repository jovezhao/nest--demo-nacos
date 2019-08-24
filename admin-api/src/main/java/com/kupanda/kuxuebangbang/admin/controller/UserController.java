package com.kupanda.kuxuebangbang.admin.controller;

import com.kupanda.kuxuebangbang.user.feign.UserFeignClient;
import com.kupanda.kuxuebangbang.user.feign.domain.UserInfoDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserFeignClient userFeignClient;


    @GetMapping("/{id}")
    UserInfoDto id(@PathVariable("id") String id){
        return userFeignClient.info(id);
    }
}
