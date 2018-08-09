package com.dojo.springboot.eureka;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class ApplicationCloudEureka {


    public static void main(String[] args) {

        new SpringApplicationBuilder(ApplicationCloudEureka.class).run(args);
    }
}
