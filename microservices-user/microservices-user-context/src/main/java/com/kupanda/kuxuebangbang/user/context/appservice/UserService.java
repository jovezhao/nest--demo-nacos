package com.kupanda.kuxuebangbang.user.context.appservice;

import com.kupanda.kuxuebangbang.user.feign.domain.UserInfoDto;

/**
 *
 **/
public interface UserService {

    UserInfoDto info(String id);
}
