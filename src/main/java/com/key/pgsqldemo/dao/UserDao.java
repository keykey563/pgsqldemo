package com.key.pgsqldemo.dao;

import com.key.pgsqldemo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {
    Integer save(@Param("user") User user);

    User findUserById(@Param("id") Integer id);
}
