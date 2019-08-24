package com.kupanda.kuxuebangbang.user.context.configure;

import com.guoshouxiang.nest.activemq.ActiveMQMessageChannel;
import com.guoshouxiang.nest.configuration.ConfigurationManager;
import com.guoshouxiang.nest.configuration.EventConfiguration;
import com.guoshouxiang.nest.container.BeanFinder;
import com.guoshouxiang.nest.context.event.channel.MessageChannelFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 **/
@Configuration
public class MQConfigure {


    private static String BROKERS="tcp://localhost:61616";

    @Bean("ACTIVEMQ_CHANNEL")
    public ActiveMQMessageChannel activeMQMessageChannel(BeanFinder beanFinder){

        ActiveMQMessageChannel messageChannel=new ActiveMQMessageChannel(beanFinder,BROKERS);
        return messageChannel;
    }

    @Bean("change_password")
    public EventConfiguration changePasswordEvent(){
        EventConfiguration eventConfiguration=new EventConfiguration();
        eventConfiguration.setEventCode("change_password");
        eventConfiguration.setMessageChannelCode("ACTIVEMQ_CHANNEL");
        return eventConfiguration;
    }



}
