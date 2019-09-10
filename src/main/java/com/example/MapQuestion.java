package com.example;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Constructor Injection with Map Example
public class MapQuestion {
    private int id;
    private String name;
    private Map<String,String> answers;

    public MapQuestion() { }
    public MapQuestion(int id, String name, Map<String,String> answers) {
        this.id = id;
        this .name = name;
        this.answers = answers;
    }

    public void displayInfo() {
        System.out.println("Question id: " + id);
        System.out.println("Question name: " +name);
        System.out.println("Answers...");
        Set<Map.Entry<String,String>> set = answers.entrySet();
        Iterator<Map.Entry<String,String>> itr = set.iterator();
        System.out.println("The ITR " + set);
        while(itr.hasNext()) {
            Map.Entry<String,String> entry = itr.next();
            System.out.println("Answer:" +entry.getKey() + " posted by " + entry.getValue());
        }
    }
}
