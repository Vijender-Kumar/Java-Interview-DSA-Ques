package com.example.interviewPractice.other.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        mainPayService mainPayService = context.getBean(mainPayService.class);
        String result = mainPayService.getService();
        System.out.println(result);
    }
}
