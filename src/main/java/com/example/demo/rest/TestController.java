package com.example.demo.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {

    @GetMapping("hello")
    public String hello(){
        log.info("Say Hello loudly along with trace Id");
        return "Hi! Hello";
    }
}
