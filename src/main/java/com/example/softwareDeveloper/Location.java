package com.example.softwareDeveloper;

public class Location {
    private String locationLine, city, state, country;

    public Location(String locationLine,String city, String state, String country) {
        this.locationLine = locationLine;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String toString() {
        return locationLine + " " + city + " " + state + " " + country;
    }
        }
