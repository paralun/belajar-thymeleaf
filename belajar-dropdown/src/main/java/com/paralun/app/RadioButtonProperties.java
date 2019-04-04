package com.paralun.app;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.SortedMap;

@Configuration
@EnableConfigurationProperties(RadioButtonProperties.class)
@PropertySource("classpath:dropdownValues.properties")
@ConfigurationProperties(prefix = "radio-value")
public class RadioButtonProperties {

    private SortedMap<String, String> statusOptions;

    public SortedMap<String, String> getStatusOptions() {
        return statusOptions;
    }

    public void setStatusOptions(SortedMap<String, String> statusOptions) {
        this.statusOptions = statusOptions;
    }
}
