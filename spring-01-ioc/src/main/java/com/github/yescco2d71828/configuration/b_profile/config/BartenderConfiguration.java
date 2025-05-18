package com.github.yescco2d71828.configuration.b_profile.config;

import com.github.yescco2d71828.configuration.b_profile.component.Bartender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("city")
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
