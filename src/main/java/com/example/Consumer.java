package com.example;

public class Consumer {
    private int id;
    private String name;

    //Constructor overloading
    public Consumer() {
        System.out.println("def cons");
    }

    public Consumer(int id) {
        this.id = id;
    }

    public Consumer(String name) {
        this.name = name;
    }

    public Consumer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void show() {
        System.out.println(id + " " + name);
    }
}
