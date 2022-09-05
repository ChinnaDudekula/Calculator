package com.amazon.Calculator;

import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService{

    PropertiesConfig propertiesConfig;

    public MyServiceImpl(PropertiesConfig propertiesConfig) {
        this.propertiesConfig = propertiesConfig;
    }

    @Override
    public String home() {
        return propertiesConfig.homeReturn + " " + propertiesConfig.applicationName;
    }

    @Override
    public String about() {
        return propertiesConfig.aboutReturn + " " + propertiesConfig.applicationName;
    }
}
