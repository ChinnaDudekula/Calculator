package com.amazon.Calculator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertiesConfig {
    @Value("${application.name}")
    public String applicationName;
    @Value("${home.return.value}")
    public String homeReturn;
    @Value("${about.return.value}")
    public String aboutReturn;
}
