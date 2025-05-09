package com.github.yescco2d71828.basic_di.d_autowired.config;

import com.github.yescco2d71828.basic_di.d_autowired.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.github.yescco2d71828.basic_di.d_autowired.bean")
public class AutowiredConfiguration {
    @Bean
    @Primary
    public Person master() {
        Person master = new Person();
        master.setName("Master");
        return master;
    }
}
