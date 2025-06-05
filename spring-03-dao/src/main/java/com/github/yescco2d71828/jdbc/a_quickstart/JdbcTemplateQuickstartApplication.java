package com.github.yescco2d71828.jdbc.a_quickstart;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.nio.file.Paths;

public class JdbcTemplateQuickstartApplication {
    public static void main(String[] args) {
        DriverManagerDataSource  dataSource = new DriverManagerDataSource();
        // 设置sqlite驱动
        dataSource.setDriverClassName("org.sqlite.JDBC");
        dataSource.setUrl("jdbc:sqlite:db/app.db");

        JdbcTemplate  jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        jdbcTemplate.execute("INSERT INTO tbl_user (name, tel) values ('hahaha', '12345')");
    }
}
