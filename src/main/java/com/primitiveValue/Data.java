package com.primitiveValue;

import com.example.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Data {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("setter.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        Client client = (Client) factory.getBean("obj");
        client.display();
    }
}
