package com.key.pgsqldemo.service.impl;

import com.key.pgsqldemo.dao.UserDao;
import com.key.pgsqldemo.entity.User;
import com.key.pgsqldemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Integer save(User user) {
        return userDao.save(user);
    }

    @Override
    public User findUserById(Integer id) {
        return userDao.findUserById(id);
    }
}
