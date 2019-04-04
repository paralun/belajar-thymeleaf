package com.paralun.app;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.SortedMap;

@Configuration
@EnableConfigurationProperties(DropdownItemProperties.class)
@PropertySource("classpath:dropdownValues.properties")
@ConfigurationProperties(prefix = "dropdown-value")
public class DropdownItemProperties {

    private SortedMap<String, String> userRoleOptions;

    public SortedMap<String, String> getUserRoleOptions() {
        return userRoleOptions;
    }

    public void setUserRoleOptions(SortedMap<String, String> userRoleOptions) {
        this.userRoleOptions = userRoleOptions;
    }
}
