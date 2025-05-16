package com.github.yescco2d71828.configuration.a_module.config;

import com.github.yescco2d71828.configuration.a_module.component.Bartender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BartenderConfiguration {
    @Bean
    public Bartender zhangsan() {
        return new Bartender("张三");
    }

    @Bean
    public Bartender lisi() {
        return new Bartender("李四");
    }
}
