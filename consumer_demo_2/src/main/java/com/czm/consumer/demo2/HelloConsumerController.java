package com.czm.consumer.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloConsumerController {
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping("/consumer2/hello/{name}")
    public String helloConsumer(@PathVariable("name") String name) {
        return restTemplate.getForObject("http://eureka-provider/hello/" + name, String.class);
    }
    @RequestMapping("/consumer2/hi/{name}")
    public String hiConsumer(@PathVariable("name") String name) {
        return restTemplate.getForObject("http://eureka-provider/hi/" + name, String.class);
    }
}
