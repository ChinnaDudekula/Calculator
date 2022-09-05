package com.amazon.Calculator;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/")
    public String myHome() {
        return myService.home();
    }

    @GetMapping("/about")
    public String about() {
        return myService.about();
    }
}

