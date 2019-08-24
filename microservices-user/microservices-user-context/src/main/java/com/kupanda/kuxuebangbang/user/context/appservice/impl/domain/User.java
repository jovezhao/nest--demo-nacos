package com.kupanda.kuxuebangbang.user.context.appservice.impl.domain;

import com.guoshouxiang.nest.context.model.BaseEntity;
import com.guoshouxiang.nest.context.model.StringIdentifier;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 **/
@NoArgsConstructor
@Data
public class User extends BaseEntity<StringIdentifier> {

    private String name;

    public void init(String name){
        this.name=name;
    }

}
