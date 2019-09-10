package com.example.softwareDeveloper;

public class Developer {
    private int id;
    private String name;
    private Location location;

    public Developer() {}

    public Developer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Developer(int id, String name, Location location) {
        super();
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public void show() {
        System.out.println(id + " " + name);
        System.out.println(location);
    }

}
