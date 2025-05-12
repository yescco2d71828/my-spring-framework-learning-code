package com.github.yescco2d71828.basic_di.g_complexfield.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class Person {
    @Value("#{new String[] {'张三', '张三丰'}}")
    private String[] names;

    @Value("#{{'3333', '333', '33', '3'}}")
    private List<String> tels;

    @Value("#{{@miaomiao, new com.github.yescco2d71828.basic_di.g_complexfield.bean.Cat()}}")
    private Set<Cat> cats;

    @Value("#{{'喵喵': @miaomiao.name, '猫猫': new com.github.yescco2d71828.basic_di.g_complexfield.bean.Cat().name}}")
    private Map<String, Object> events;

    @Value("#{{'123': '牵着手', '456': '抬起头', '789': '私奔到月球'}}")
    private Properties props;

    public void setNames(String[] names) {
        this.names = names;
    }

    public void setTels(List<String> tels) {
        this.tels = tels;
    }

    public void setCats(Set<Cat> cats) {
        this.cats = cats;
    }

    public void setEvents(Map<String, Object> events) {
        this.events = events;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    @Override
    public String toString() {
        return "Person{\n"
                + " names="
                + Arrays.toString(names)
                + ",\n tels="
                + tels
                + ",\n cats="
                + cats
                + ",\n events="
                + events
                + ",\n props="
                + props
                + "\n}";
    }
}
