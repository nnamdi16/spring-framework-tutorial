package com.SetterInjection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTweet {
    public static void main(String[] args) {
        //Setter Injection Collection Object
        ApplicationContext context = new ClassPathXmlApplicationContext("tweet.xml");
        ApplicationContext context2 = new ClassPathXmlApplicationContext("ping.xml");
        Tweet tweet = (Tweet) context.getBean("tweet");
        tweet.displayInfo();
        Issues issues = (Issues) context.getBean("issues");
        issues.displayInfo();
        Post post = (Post) context.getBean("post");
        post.displayInfo();
        Ping ping  = (Ping) context2.getBean("ping");
        ping.displayInfo();
    }
}
