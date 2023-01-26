package com.example.testpruefungprojecttobedeleted;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToBeDeletedController {
    @GetMapping("/parameter")
    public int giveMeNumber(int a){
        int base = 100;

        return base * a;
    }
    @GetMapping("/say")
    public String sayHello(){
        return "Hello";
    }
}
