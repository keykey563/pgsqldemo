package com.key.pgsqldemo.service;

import com.key.pgsqldemo.entity.User;

public interface IUserService {
    Integer save(User user);

    User findUserById(Integer id);
}
