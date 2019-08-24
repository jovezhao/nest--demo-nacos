package com.kupanda.kuxuebangbang.user.feign.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 *
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserInfoDto implements Serializable {

    private String id;

    private String name;
}
