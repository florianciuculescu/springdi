package com.example.springdi;

import com.example.springdi.controllers.ConstructorInjectedController;
import com.example.springdi.controllers.MyController;
import com.example.springdi.controllers.PropertyInjectedController;
import com.example.springdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringdiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringdiApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        System.out.println("------- Primary");

        System.out.println(myController.sayHello());

        System.out.println("------- Property");

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("------- Setter");

        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

        System.out.println(setterInjectedController.getGreeting());

        System.out.println("------- Constructor");

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

        System.out.println(constructorInjectedController.getGreeting());
    }

}
