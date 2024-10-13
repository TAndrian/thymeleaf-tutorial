package com.example.thymeleaf_tutorial.service.impl;

import com.example.thymeleaf_tutorial.service.HelloWorldService;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public String getHelloWorld() {
        return "Hello world !";
    }
}
