package com.github.yescco2d71828.event.a_quickstart.listener;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ContextClosedApplicationListener {
    @EventListener
    public void onContextClosed(final ContextClosedEvent event) {
        System.out.println("ContextClosedApplicationListener监听到ContextClosedEvent");
    }
}
