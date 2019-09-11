package com.singleton;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Index {
    public static void main(String[] args) {
        AbstractApplicationContext context1 = new ClassPathXmlApplicationContext("lifecycle.xml");
        Greeting style = (Greeting) context1.getBean("greeting");
        style.getMessage1();
        style.getMessage2();

        GreetingIndia styleIndia = (GreetingIndia) context1.getBean("helloIndia");
        styleIndia.getMessage1();
        styleIndia.getMessage2();
        styleIndia.getMessage3();
        context1.registerShutdownHook();
    }
}
