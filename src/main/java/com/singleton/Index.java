package com.singleton;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Index {
    public static void main(String[] args) {
        AbstractApplicationContext context1 = new ClassPathXmlApplicationContext("lifecycle.xml");
        Greeting style = (Greeting) context1.getBean("message");
        style.getMessage();
        context1.registerShutdownHook();
    }
}
