package com.github.yescco2d71828.jdbc.c_dao.dao.impl;

import com.github.yescco2d71828.jdbc.c_dao.bean.User;
import com.github.yescco2d71828.jdbc.c_dao.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate  jdbcTemplate;

    @Override
    public void save(User user) {
        jdbcTemplate.update("insert into tbl_user(name, tel) values(?,?)", user.getName(), user.getTel());
    }

    @Override
    public User findById(Integer id) {
        List<User> list = jdbcTemplate.query("select * from tbl_user where id = ?", new BeanPropertyRowMapper<>(User.class), id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<User> findAll() {
        return jdbcTemplate.query("select * from tbl_user", new BeanPropertyRowMapper<>(User.class));
    }
}
