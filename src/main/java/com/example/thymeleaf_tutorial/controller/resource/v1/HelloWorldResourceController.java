package com.example.thymeleaf_tutorial.controller.resource.v1;

import com.example.thymeleaf_tutorial.service.HelloWorldService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/hello")
@AllArgsConstructor
public class HelloWorldResourceController {

    private HelloWorldService helloWorldService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String getHelloWorld() {
        return helloWorldService.getHelloWorld();
    }
}
