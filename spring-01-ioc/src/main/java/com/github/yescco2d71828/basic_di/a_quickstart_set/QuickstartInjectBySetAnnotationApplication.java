package com.github.yescco2d71828.basic_di.a_quickstart_set;

import com.github.yescco2d71828.basic_di.a_quickstart_set.bean.Person;
import com.github.yescco2d71828.basic_di.a_quickstart_set.config.QuickstartInjectBySetConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class QuickstartInjectBySetAnnotationApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(QuickstartInjectBySetConfiguration.class);
        Person person = context.getBean(Person.class);
        System.out.println(person);
    }
}
