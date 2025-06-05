package com.github.yescco2d71828.jdbc.b_crud;

import com.github.yescco2d71828.jdbc.a_quickstart.JdbcTemplateAnnotationConfiguration;
import com.github.yescco2d71828.jdbc.b_crud.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

public class JdbcTemplateCRUDApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcTemplateAnnotationConfiguration.class);
        JdbcTemplate jdbcTemplate = new JdbcTemplate(context.getBean(DriverManagerDataSource.class));
        System.out.println("全表搜索");
        List<User> userList = jdbcTemplate.query("select * from tbl_user", new BeanPropertyRowMapper<>(User.class));
        userList.forEach(System.out::println);
        System.out.println("筛选id>2");
        List<User> userList2 = jdbcTemplate.query("select * from tbl_user where id > ?", new BeanPropertyRowMapper<>(User.class), 2);
        userList2.forEach(System.out::println);
        System.out.println("查询id=2");
        List<User> userList3 = jdbcTemplate.query("select * from tbl_user where id = ?", new BeanPropertyRowMapper<>(User.class), 2);
        User user = userList3.size() > 0 ? userList3.get(0) : null;
        System.out.println(user);
    }
}
