package com.github.yescco2d71828.basic_di.c_value_spel;

import com.github.yescco2d71828.basic_di.c_value_spel.bean.Black;
import com.github.yescco2d71828.basic_di.c_value_spel.bean.Blue;
import com.github.yescco2d71828.basic_di.c_value_spel.bean.Green;
import com.github.yescco2d71828.basic_di.c_value_spel.bean.White;
import com.github.yescco2d71828.basic_di.c_value_spel.config.InjectValueConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InjectValueAnnoApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(InjectValueConfiguration.class);
        System.out.println(context.getBean(Black.class));
        System.out.println(context.getBean(Blue.class));
        System.out.println(context.getBean(Green.class));
        System.out.println(context.getBean(White.class));
    }
}
