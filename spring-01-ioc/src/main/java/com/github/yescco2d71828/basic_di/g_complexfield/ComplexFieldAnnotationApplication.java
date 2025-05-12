package com.github.yescco2d71828.basic_di.g_complexfield;

import com.github.yescco2d71828.basic_di.g_complexfield.bean.Person;
import com.github.yescco2d71828.basic_di.g_complexfield.config.InjectComplexFieldConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComplexFieldAnnotationApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(InjectComplexFieldConfiguration.class);
        System.out.println(context.getBean(Person.class));
    }
}
