package com.example.testpruefungprojecttobedeleted;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToBeDeletedController {
    @GetMapping("/parameter")
    public int sayHello(){
        return 10;
    }
}
