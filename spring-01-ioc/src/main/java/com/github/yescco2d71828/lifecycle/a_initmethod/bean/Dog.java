package com.github.yescco2d71828.lifecycle.a_initmethod.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Dog {
    @Value("#{'拉拉'}")
    private String name;

    @PostConstruct
    public void init() {
        System.out.println(name + " init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println(name + " destroy");
    }
}
