package sdsddemo1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FirstRest {
    @GetMapping("/sayHello")
    public String sayHello() {
        return "<html><h1>sd</h1></html>";
    }
}
