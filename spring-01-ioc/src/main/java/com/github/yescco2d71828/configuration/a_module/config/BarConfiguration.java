package com.github.yescco2d71828.configuration.a_module.config;

import com.github.yescco2d71828.configuration.a_module.component.Bar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BarConfiguration {
    @Bean
    public Bar bbbar() {
        return new Bar();
    }
}
