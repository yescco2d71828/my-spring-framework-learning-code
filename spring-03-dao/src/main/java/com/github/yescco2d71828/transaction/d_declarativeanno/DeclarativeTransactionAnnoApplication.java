package com.github.yescco2d71828.transaction.d_declarativeanno;

import com.github.yescco2d71828.transaction.d_declarativeanno.config.DeclarativeTransactionConfiguration;
import com.github.yescco2d71828.transaction.d_declarativeanno.service.AccountService;
import com.github.yescco2d71828.transaction.d_declarativeanno.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DeclarativeTransactionAnnoApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(DeclarativeTransactionConfiguration.class);

        UserService userService = context.getBean(UserService.class);
        userService.SaveAndQuery();

        AccountService accountService = context.getBean(AccountService.class);
        accountService.transfer(1, 2, 100);
    }
}
