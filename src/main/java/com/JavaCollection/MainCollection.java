package com.JavaCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCollection {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("collection.xml");
        JavaCollection jc = (JavaCollection)context.getBean("javaCollection");
        jc.getAddressList();
        jc.getAddressMap();
        jc.getAddressSet();
        jc.getAddressProp();
    }
}
