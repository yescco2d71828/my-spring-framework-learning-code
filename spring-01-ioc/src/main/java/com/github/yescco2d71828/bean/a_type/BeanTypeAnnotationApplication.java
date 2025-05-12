package com.github.yescco2d71828.bean.a_type;

import com.github.yescco2d71828.bean.a_type.bean.Toy;
import com.github.yescco2d71828.bean.a_type.config.BeanTypeConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanTypeAnnotationApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanTypeConfiguration.class);
        System.out.println(context.getBean(Toy.class));
    }
}
