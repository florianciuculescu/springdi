package com.example.springdi;

import com.example.springdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringdiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringdiApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        String greeting = myController.sayHello();
        System.out.println(greeting);
    }

}
