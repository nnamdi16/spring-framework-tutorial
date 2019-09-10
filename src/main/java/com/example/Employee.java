package com.example;

public class Employee {

    //Dependency Injection
    Address address; //aggregation.

    Employee(Address address) {
        this.address = address;
    }

    //Instance of Address class is provided by external source such as XML file either by constructor or setter method
    public void setAddress(Address address) {
        this.address = address;
    }


}
