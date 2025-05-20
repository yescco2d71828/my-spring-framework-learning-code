package com.github.yescco2d71828.aop.b_aspectj;

import com.github.yescco2d71828.aop.b_aspectj.config.AspectJAopConfiguration;
import com.github.yescco2d71828.aop.b_aspectj.service.FinanceService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationAspectJApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AspectJAopConfiguration.class);
        FinanceService financeService = context.getBean(FinanceService.class);
        financeService.addMoney(100);
        financeService.subtractMoney(100);
        financeService.getMoneyById("abc");
    }
}
