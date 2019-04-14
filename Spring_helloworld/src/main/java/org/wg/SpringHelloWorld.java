package org.wg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableTransactionManagement
public class SpringHelloWorld extends SpringBootServletInitializer {

    @RequestMapping("/")
    public String hello() {
        System.out.println("hello Spring");
        return "hello Spring";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringHelloWorld.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringHelloWorld.class);
    }
}
