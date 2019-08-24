package com.kupanda.kuxuebangbang.user.context.appservice.impl;

import com.guoshouxiang.nest.context.event.EventBus;
import com.guoshouxiang.nest.context.loader.EntityLoader;
import com.guoshouxiang.nest.context.loader.RepositoryEntityLoader;
import com.guoshouxiang.nest.context.model.StringIdentifier;
import com.guoshouxiang.nest.spring.AppService;
import com.kupanda.kuxuebangbang.user.context.appservice.UserService;
import com.kupanda.kuxuebangbang.user.context.appservice.impl.domain.User;
import com.kupanda.kuxuebangbang.user.event.PasswordChangedEvent;
import com.kupanda.kuxuebangbang.user.event.domain.PasswordChangedEventData;
import com.kupanda.kuxuebangbang.user.feign.domain.UserInfoDto;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 **/
@AppService
public class UserServiceImpl implements UserService {

    @Autowired
    private EventBus eventBus;

    @Override
    public UserInfoDto info(String id) {
        EntityLoader<User> userEntityLoader=new RepositoryEntityLoader(User.class);
        User user = userEntityLoader.create(StringIdentifier.valueOf(id));
        UserInfoDto userInfoDto=new UserInfoDto();
        userInfoDto.setName(user.getName());
        userInfoDto.setId(user.getId().getId());
        PasswordChangedEventData eventData = new PasswordChangedEventData();
        eventData.setNewPassword("11111111111");
        eventData.setUserId(id);
        eventData.setOldPassword("22222222222222");

        PasswordChangedEvent passwordChangedEvent=new PasswordChangedEvent(eventData,"");
        eventBus.publish(passwordChangedEvent);
        return userInfoDto;
    }
}
