package com.SetterInjection;

public class Follower {
    private int id;
    private String name,email;
    public Follower() { }
    public Follower(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return " id: " + id + " Name: " + name  + " Email Id: " + email;
    }
}
