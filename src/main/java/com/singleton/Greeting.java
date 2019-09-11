package com.singleton;

public class Greeting {
    private String message1;
    private String message2;

    public void getMessage1() {
        System.out.println("World Message 1: " + message1);
    }

    public void setMessage1(String message) {
        this.message1 = message;
    }

    public void getMessage2() {
        System.out.println("World Message2 : " + message2);
    }

    public void setMessage2(String message) {
        this.message2 = message;
    }

    public void init() {
        System.out.println("Bean is going through init");
    }

    public void destroy() {
        System.out.println("Bean will destroy now");
    }
}
