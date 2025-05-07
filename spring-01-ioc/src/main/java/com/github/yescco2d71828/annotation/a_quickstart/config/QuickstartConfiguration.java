package com.github.yescco2d71828.annotation.a_quickstart.config;

import com.github.yescco2d71828.annotation.a_quickstart.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuickstartConfiguration {
    @Bean
    public Person person() {
        return new Person();
    }
}
