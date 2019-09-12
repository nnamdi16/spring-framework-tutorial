package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAuto {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowire.xml");
        SampleA sampleA = context.getBean("sampleA", SampleA.class);
        sampleA.display();
    }
}
