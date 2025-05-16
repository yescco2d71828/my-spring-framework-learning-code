package com.github.yescco2d71828.configuration.a_module.anno;

import com.github.yescco2d71828.configuration.a_module.component.Boss;
import com.github.yescco2d71828.configuration.a_module.config.BartenderConfiguration;
import com.github.yescco2d71828.configuration.a_module.registrar.WaiterRegistrar;
import com.github.yescco2d71828.configuration.a_module.selector.BarImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({Boss.class, BartenderConfiguration.class, BarImportSelector.class, WaiterRegistrar.class})
public @interface EnableTavern {
}
