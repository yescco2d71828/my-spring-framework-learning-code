package com.github.yescco2d71828.jdbc.a_quickstart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JdbcTemplateAnnotationApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcTemplateAnnotationConfiguration.class);
        JdbcTemplate jdbcTemplate = new JdbcTemplate(context.getBean(DriverManagerDataSource.class));
        jdbcTemplate.execute("insert into tbl_account (user_id, money) values (3, 100)");
    }
}
