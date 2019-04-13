package org.wg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class SpringHelloWorld {

    @RequestMapping("/")
    public String hello() {
        System.out.println("hello Spring");
        return "hello Spring";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringHelloWorld.class, args);
    }
}
