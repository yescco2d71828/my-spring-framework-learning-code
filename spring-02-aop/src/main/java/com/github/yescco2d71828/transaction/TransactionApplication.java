package com.github.yescco2d71828.transaction;

import com.github.yescco2d71828.transaction.config.TransactionAspectConfiguration;
import com.github.yescco2d71828.transaction.service.FinanceService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TransactionApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TransactionAspectConfiguration.class);
        FinanceService service = context.getBean(FinanceService.class);
        service.transfer(1L, 2L, 100);
    }
}
