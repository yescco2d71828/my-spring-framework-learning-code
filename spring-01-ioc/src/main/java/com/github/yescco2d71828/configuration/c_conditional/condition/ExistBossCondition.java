package com.github.yescco2d71828.configuration.c_conditional.condition;

import com.github.yescco2d71828.configuration.c_conditional.component.Boss;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class ExistBossCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return conditionContext.getBeanFactory().containsBeanDefinition(Boss.class.getName());
    }
}
