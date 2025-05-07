package com.github.yescco2d71828.annotation.a_quickstart;

import com.github.yescco2d71828.annotation.a_quickstart.bean.Person;
import com.github.yescco2d71828.annotation.a_quickstart.config.QuickstartConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(QuickstartConfiguration.class);
        Person person = context.getBean(Person.class);
        System.out.println(person);
    }
}
