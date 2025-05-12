package com.github.yescco2d71828.bean.a_type.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ToyFactoryBean implements FactoryBean<Toy> {

    @Autowired
    private Child child;

    @Override
    public Toy getObject() throws Exception {
        switch (child.getWantToy()) {
            case "ball":
                return new Ball("ball");
            case "car":
                return new Car("car");
            default:
                return null;
        }
    }

    @Override
    public Class<Toy> getObjectType() {
        return Toy.class;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
