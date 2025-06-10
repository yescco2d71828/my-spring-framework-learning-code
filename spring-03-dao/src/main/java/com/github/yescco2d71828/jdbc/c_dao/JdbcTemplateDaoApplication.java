package com.github.yescco2d71828.jdbc.c_dao;

import com.github.yescco2d71828.jdbc.c_dao.config.JdbcConfiguration;
import com.github.yescco2d71828.jdbc.c_dao.dao.UserDao;
import com.github.yescco2d71828.jdbc.c_dao.dao.impl.UserDaoImpl;
import com.github.yescco2d71828.jdbc.c_dao.dao.impl.UserDaoImpl2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JdbcTemplateDaoApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfiguration.class);
        UserDao userDao = context.getBean(UserDaoImpl.class);
        userDao.findAll().forEach(System.out::println);
        UserDao userDao2 = context.getBean(UserDaoImpl2.class);
        userDao2.findAll().forEach(System.out::println);
    }
}
