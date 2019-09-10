package com.example;

public class Consumer {
    private int id;
    private String name;
    private Address address; //Aggregation

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

    public Consumer(int id, String name, Address address) {
        super();
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void show() {
        System.out.println(id + " " + name);
        System.out.println(address.toString());
    }
}
