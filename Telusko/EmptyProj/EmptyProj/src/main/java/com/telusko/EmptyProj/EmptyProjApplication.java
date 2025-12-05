package com.telusko.EmptyProj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EmptyProjApplication {

	public static void main(String[] args) {
        ApplicationContext ioc = SpringApplication.run(EmptyProjApplication.class, args);

        Dev obj = ioc.getBean(Dev.class);
        System.out.println(obj.greetUser());

	}

}
