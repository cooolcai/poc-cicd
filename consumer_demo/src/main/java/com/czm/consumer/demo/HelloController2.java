package com.czm.consumer.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController2 {
    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return "provider: helloddd2" + name;
    }
}
