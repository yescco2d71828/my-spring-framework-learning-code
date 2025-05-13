package com.github.yescco2d71828.lifecycle.a_initmethod;

import com.github.yescco2d71828.lifecycle.a_initmethod.bean.Dog;
import com.github.yescco2d71828.lifecycle.a_initmethod.config.InitMethodConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InitMethodAnnotation {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(InitMethodConfiguration.class);
        Thread.sleep(3000);
        context.close();
    }
}
