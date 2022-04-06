package com.zk.productcenter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class ProductCenterApplication {


    @Value("${server.port}")
    private String port;

    @Value( "${spring.application.name}" )
    private String name;

    @GetMapping("/getInfo")
    public String getServerPortAndName(){

        return  this.name +" : "+ this.port;
    }

    public static void main(String[] args) {
        SpringApplication.run(ProductCenterApplication.class, args);
    }




}
