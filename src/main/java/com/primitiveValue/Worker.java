package com.primitiveValue;

public class Worker {
    private int id;
    private String name;
    private Residence residence;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Residence getResidence() {
        return residence;
    }

    public void setResidence(Residence residence) {
        this.residence = residence;
    }

    public void  displayInfo() {
        System.out.println(id + " " + name);
        System.out.println(residence);
    }
}
