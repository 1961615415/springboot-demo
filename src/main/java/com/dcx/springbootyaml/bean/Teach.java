package com.dcx.springbootyaml.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Component
@PropertySource("teach.properties")
@ConfigurationProperties(prefix = "teach")
public class Teach {
    private String name;
}
