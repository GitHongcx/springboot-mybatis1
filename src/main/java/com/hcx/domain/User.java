package com.hcx.domain;

import lombok.Data;
import lombok.ToString;

/**
 * Created by hongcaixia on 2020/2/10.
 */
@Data
@ToString
public class User {

    private Integer id;
    private String name;
    private String password;
}
