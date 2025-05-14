package com.github.yescco2d71828.event.a_quickstart;

import com.github.yescco2d71828.event.a_quickstart.config.QuickstartListenerConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class QuickstartListenerApplication {
    public static void main(String[] args) throws Exception {
        System.out.println("准备初始化IOC容器");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(QuickstartListenerConfiguration.class);
        System.out.println("IOC容器初始化完成");
        Thread.sleep(3000);
        context.close();
        System.out.println("IOC容器已关闭");
    }
}
