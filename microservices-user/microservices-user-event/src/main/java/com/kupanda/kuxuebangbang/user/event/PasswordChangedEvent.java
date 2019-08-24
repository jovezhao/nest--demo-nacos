package com.kupanda.kuxuebangbang.user.event;

import com.guoshouxiang.nest.context.event.BaseEvent;
import com.kupanda.kuxuebangbang.user.event.domain.PasswordChangedEventData;

/**
 * 消息事件
 **/
public class PasswordChangedEvent extends BaseEvent<PasswordChangedEventData> {


    public static final String EVENT_NAME="CHANGE_PASSWORD";

    public PasswordChangedEvent(PasswordChangedEventData eventObject, String source) {
        super(eventObject, source);
    }

    @Override
    public String getEventCode() {
        return EVENT_NAME;
    }
}
