package com.example.demo.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
public class TestController {

    @GetMapping("hello")
    public Mono<String> hello(){
        log.info("Say Hellowww loudly");
        return Mono.fromSupplier(()-> "Say Hello");
    }
}
