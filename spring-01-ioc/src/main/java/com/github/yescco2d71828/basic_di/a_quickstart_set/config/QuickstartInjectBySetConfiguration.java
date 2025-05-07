package com.github.yescco2d71828.basic_di.a_quickstart_set.config;

import com.github.yescco2d71828.basic_di.a_quickstart_set.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuickstartInjectBySetConfiguration {
    @Bean
    public Person person() {
        Person person = new Person();
        person.setAge(20);
        person.setName("尼古拉斯赵四");
        return person;
    }
}
