package com.github.yescco2d71828.configuration.a_module.selector;

import com.github.yescco2d71828.configuration.a_module.component.Bar;
import com.github.yescco2d71828.configuration.a_module.config.BarConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class BarImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[] {Bar.class.getName(), BarConfiguration.class.getName()};
    }
}
