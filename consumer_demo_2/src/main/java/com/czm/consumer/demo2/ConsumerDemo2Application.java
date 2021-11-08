package com.czm.consumer.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//@SpringBootApplication
//@EnableDiscoveryClient
//@EnableEurekaClient
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerDemo2Application {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerDemo2Application.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate getRrestTemplate() {
        return new RestTemplate();
    }
}
