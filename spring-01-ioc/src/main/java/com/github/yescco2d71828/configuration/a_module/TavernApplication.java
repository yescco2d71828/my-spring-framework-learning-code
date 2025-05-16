package com.github.yescco2d71828.configuration.a_module;

import com.github.yescco2d71828.configuration.a_module.component.Bar;
import com.github.yescco2d71828.configuration.a_module.component.Bartender;
import com.github.yescco2d71828.configuration.a_module.component.Boss;
import com.github.yescco2d71828.configuration.a_module.component.Waiter;
import com.github.yescco2d71828.configuration.a_module.config.TavernConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TavernApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TavernConfiguration.class);
        System.out.println(context.getBean(Boss.class));
        System.out.println(context.getBeansOfType(Bartender.class));
        System.out.println(context.getBeansOfType(Bar.class));
        System.out.println(context.getBeansOfType(Waiter.class));
    }
}
