package com.github.yescco2d71828.annotation.c_scan;

import com.github.yescco2d71828.annotation.c_scan.bean.Person;
import com.github.yescco2d71828.annotation.c_scan.config.ComponentScanConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentScanApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfiguration.class);
        Person person = context.getBean(Person.class);
        System.out.println(person);
    }
}
