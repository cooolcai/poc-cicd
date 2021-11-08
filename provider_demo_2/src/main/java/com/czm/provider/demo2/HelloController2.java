package com.czm.provider.demo2;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController2 {
    @RequestMapping("/hi/{name}")
    public String hello(@PathVariable("name") String name) {
        return "provider: 这里是生产者的第二个接口！\nhi " + name;
    }
}
