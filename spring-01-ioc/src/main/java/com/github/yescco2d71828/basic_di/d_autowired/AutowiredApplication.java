package com.github.yescco2d71828.basic_di.d_autowired;

import com.github.yescco2d71828.basic_di.d_autowired.bean.Cat;
import com.github.yescco2d71828.basic_di.d_autowired.bean.Dog;
import com.github.yescco2d71828.basic_di.d_autowired.bean.Person;
import com.github.yescco2d71828.basic_di.d_autowired.config.AutowiredConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiredApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AutowiredConfiguration.class);
        System.out.println(context.getBean(Cat.class));
        System.out.println(context.getBean(Dog.class));
        System.out.println(context.getBean(Person.class));
    }
}
