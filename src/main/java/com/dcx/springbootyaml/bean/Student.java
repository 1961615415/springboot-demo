package com.dcx.springbootyaml.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
@Component
@Data
@ConfigurationProperties(prefix = "student")
public class Student {
    private String name;
    private int age;
    private Map<String,String> map;
    private List<String> list;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", map=" + map +
                ", list=" + list +
                '}';
    }


}
