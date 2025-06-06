package com.github.yescco2d71828.jdbc.c_dao.dao;

import com.github.yescco2d71828.jdbc.c_dao.bean.User;

import java.util.List;

public interface UserDao {
    void save(User user);
    User findById(Integer id);
    List<User> findAll();
}
