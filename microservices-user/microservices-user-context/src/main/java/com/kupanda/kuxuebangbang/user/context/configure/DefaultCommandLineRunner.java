package com.kupanda.kuxuebangbang.user.context.configure;

import com.guoshouxiang.nest.context.event.EventBus;
import com.guoshouxiang.nest.context.event.EventHandler;
import com.kupanda.kuxuebangbang.user.context.event.PasswordChangedHandler;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;

@Component
public class DefaultCommandLineRunner implements ApplicationContextAware {
    @Autowired
    private EventBus eventBus;

    @Autowired
    private PasswordChangedHandler passwordChangedHandler;


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        eventBus.autoRegister();


    }
}
