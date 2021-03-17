package ru.fil.gwt.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "ru.fil.gwt.server.config",
        "ru.fil.gwt.server.service"
})
public class BeanConfig {
}
