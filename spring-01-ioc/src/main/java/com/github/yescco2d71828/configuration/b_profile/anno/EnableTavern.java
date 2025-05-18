package com.github.yescco2d71828.configuration.b_profile.anno;

import com.github.yescco2d71828.configuration.b_profile.component.Boss;
import com.github.yescco2d71828.configuration.b_profile.config.BartenderConfiguration;
import com.github.yescco2d71828.configuration.b_profile.registrar.WaiterRegistrar;
import com.github.yescco2d71828.configuration.b_profile.selector.BarImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({Boss.class, BartenderConfiguration.class, BarImportSelector.class, WaiterRegistrar.class})
public @interface EnableTavern {
}
