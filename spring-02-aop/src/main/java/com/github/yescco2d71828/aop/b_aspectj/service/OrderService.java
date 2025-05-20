package com.github.yescco2d71828.aop.b_aspectj.service;

import java.util.List;

public interface OrderService {

    void createOrder();

    void deleteOrderById(String id);

    String getOrderById(String id);

    List<String> findAll();
}
