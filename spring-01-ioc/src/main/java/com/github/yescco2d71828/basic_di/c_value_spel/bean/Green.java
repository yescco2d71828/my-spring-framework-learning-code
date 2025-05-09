package com.github.yescco2d71828.basic_di.c_value_spel.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Green {
    @Value("#{'copy by' + blue.name}")
    private String name;

    @Value("#{'3'}")
    private Integer order;

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Blue{" + "name='" + name + '\'' + ", order=" + order + '}';
    }
}
