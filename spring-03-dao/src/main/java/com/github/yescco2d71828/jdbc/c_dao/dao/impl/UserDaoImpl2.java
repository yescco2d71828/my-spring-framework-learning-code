package com.github.yescco2d71828.jdbc.c_dao.dao.impl;

import com.github.yescco2d71828.jdbc.c_dao.bean.User;
import com.github.yescco2d71828.jdbc.c_dao.dao.BaseDao;
import com.github.yescco2d71828.jdbc.c_dao.dao.UserDao;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl2 extends BaseDao implements UserDao {
    @Override
    public void save(User user) {
        this.getJdbcTemplate().update("insert into tbl_user(name, tel) values(?,?)", user.getName(), user.getTel());
    }

    @Override
    public User findById(Integer id) {
        List<User> list = this.getJdbcTemplate().query("select * from tbl_user where id = ?", new BeanPropertyRowMapper<>(User.class), id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<User> findAll() {
        return this.getJdbcTemplate().query("select * from tbl_user", new BeanPropertyRowMapper<>(User.class));
    }
}
