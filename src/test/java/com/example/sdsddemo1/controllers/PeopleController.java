package com.example.sdsddemo1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/people")
public class PeopleController {
    @GetMapping("/person")
    public String[] person() {
        String list[] = {"ya", "SE"};
        return list;
    }
}
