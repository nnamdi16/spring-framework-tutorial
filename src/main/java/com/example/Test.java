package com.example;

import com.example.nonString.MapObject;
import com.example.softwareDeveloper.Developer;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
    public static void main(String[] args) {
        //Resource object refers to the information of the applicationContext.xml
        //ClassPath resource is an implementation of the Resource Interface.
        //XmlBeanFactory is an implementation of the Bean Factory.
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

        //getBean method returns the object of the associated class
        Student student = (Student)factory.getBean("studentbean");
        Consumer consumer = (Consumer)factory.getBean("consumerBean");
        Question question = (Question)factory.getBean("questionBean");
        Chat chat = (Chat)factory.getBean("chatBean");
        MapQuestion mapQuestion = (MapQuestion)factory.getBean("MapBean");
        MapObject mapObject = (MapObject)factory.getBean("mapObject") ;
        Developer developer = (Developer)factory.getBean("locationBean2");
        developer.show();
        mapObject.displayInfo();
        mapQuestion.displayInfo();
        chat.displayInfo();
        student.displayInfo();
        consumer.show();
        question.displayInfo();
    }
}
