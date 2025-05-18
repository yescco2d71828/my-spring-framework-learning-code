package com.github.yescco2d71828.configuration.c_conditional.anno;

import com.github.yescco2d71828.configuration.c_conditional.component.Boss;
import com.github.yescco2d71828.configuration.c_conditional.config.BartenderConfiguration;
import com.github.yescco2d71828.configuration.c_conditional.registrar.WaiterRegistrar;
import com.github.yescco2d71828.configuration.c_conditional.selector.BarImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({Boss.class, BartenderConfiguration.class, BarImportSelector.class, WaiterRegistrar.class})
public @interface EnableTavern {
}
