package com.example.thymeleaf_tutorial.controller.views;

import com.example.thymeleaf_tutorial.service.HelloWorldService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class HelloWorldViewController {

    private HelloWorldService helloWorldService;

    /**
     * URL: <a href="http://localhost:8080/hello">...</a>.
     * It must be annotated with @Controller and not @RestController.
     *
     * @param model to pass attributes & values
     *              or also called "variable expressions" to the view.
     *              Here the attribute or also called variable name is "message",
     *              and it contains the value "hello world!".
     * @return view hello-world(.html) (the html file located in the templates folder).
     */
    @GetMapping("/hello")
    public String helloWorld(Model model) {
        model.addAttribute("message", helloWorldService.getHelloWorld());
        return "hello-world";
    }
}
