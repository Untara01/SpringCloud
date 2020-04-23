package com.simons.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient  //该注解标识这个一个该服务包含了Eureka Client
public class TicketConsumerEurekaApplication {
    //尝试commit
    public static void main(String[] args) {

        int i=0;
        SpringApplication.run(TicketConsumerEurekaApplication.class,args);
    }

}
