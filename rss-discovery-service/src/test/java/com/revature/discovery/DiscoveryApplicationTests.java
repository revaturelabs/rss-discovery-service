package com.revature.discovery;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//@SpringBootTest
//class DiscoveryApplicationTests {
//
//    @Test
//    void contextLoads() {
//    }
//
//}

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryApplicationTests {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryApplication.class, args);
    }

}
