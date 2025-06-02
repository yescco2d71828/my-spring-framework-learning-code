package com.github.yescco2d71828.demo;

import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLiteDemo {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("org.sqlite.JDBC");
            String projectRoot = System.getProperty("user.dir");
            String dbPath = Paths.get(projectRoot, "db", "app.db").toString();
            connection = DriverManager.getConnection("jdbc:sqlite:" + dbPath);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT id, username, age FROM user;");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("id") + " " + resultSet.getString("username") + " " + resultSet.getInt("age"));
            }
            resultSet.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
