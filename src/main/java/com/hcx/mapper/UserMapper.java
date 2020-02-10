package com.hcx.mapper;

import com.hcx.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by hongcaixia on 2020/2/10.
 */
@Mapper
public interface UserMapper {

    List<User> selectUserList();
}
