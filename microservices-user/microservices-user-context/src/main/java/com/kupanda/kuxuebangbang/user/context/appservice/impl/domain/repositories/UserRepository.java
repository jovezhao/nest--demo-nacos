package com.kupanda.kuxuebangbang.user.context.appservice.impl.domain.repositories;

import com.guoshouxiang.nest.context.loader.EntityLoader;
import com.guoshouxiang.nest.context.model.Identifier;
import com.guoshouxiang.nest.context.repository.Repository;
import com.kupanda.kuxuebangbang.user.context.appservice.impl.domain.User;
import org.springframework.stereotype.Component;

/**
 *
 **/
@Component
public class UserRepository implements Repository<User> {
    @Override
    public Class<User> getEntityClass() {
        return User.class;
    }

    @Override
    public User getEntityById(Identifier identifier, EntityLoader<User> entityLoader) {

        User user = entityLoader.create(identifier);
        user.setName("测试");
        return user;
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void remove(User user) {

    }
}
