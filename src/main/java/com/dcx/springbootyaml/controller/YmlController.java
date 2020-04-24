package com.dcx.springbootyaml.controller;

import com.dcx.springbootyaml.bean.Student;
import com.dcx.springbootyaml.bean.Teach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("yml")
public class YmlController {
    @Autowired
    Student student;
    @Autowired
    Teach teach;
    @GetMapping("test")
    public Student test(){
        return student;
    }
    @GetMapping
    public Teach getTeach(){
        return teach;
    }
}
