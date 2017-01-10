package com.irgat.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldEndpoint
{
    @RequestMapping("/helloWorld")
    public String helloWorld() {
        return "Hello World!";
    }
}
