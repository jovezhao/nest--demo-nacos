package com.kupanda.kuxuebangbang.user.feign;

import com.kupanda.kuxuebangbang.user.feign.domain.UserInfoDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * User Feign客户端
 **/
@FeignClient(name = "microservice-user-context")
public interface UserFeignClient {

    @GetMapping("/{id}")
    UserInfoDto info(@PathVariable("id") String id);
}
