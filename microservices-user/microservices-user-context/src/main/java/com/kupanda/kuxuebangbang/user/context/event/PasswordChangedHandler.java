package com.kupanda.kuxuebangbang.user.context.event;

import com.guoshouxiang.nest.context.event.EventArgs;
import com.guoshouxiang.nest.context.event.EventHandler;
import com.kupanda.kuxuebangbang.user.event.PasswordChangedEvent;
import com.kupanda.kuxuebangbang.user.event.domain.PasswordChangedEventData;
import org.springframework.stereotype.Component;

@Component()
public class PasswordChangedHandler implements EventHandler<PasswordChangedEventData> {

    @Override
    public String getEventCode() {
        return PasswordChangedEvent.EVENT_NAME;
    }

    @Override
    public Class<PasswordChangedEventData> getEventDataClass() {
        return PasswordChangedEventData.class;
    }

    @Override
    public void handle(PasswordChangedEventData passwordChangedEventData, EventArgs eventArgs) {
        System.out.println("收到事件" + passwordChangedEventData);
    }
}
