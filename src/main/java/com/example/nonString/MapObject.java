package com.example.nonString;


import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Constructor Injection with Non-String Map
public class MapObject {
    private int id;
    private String name;
    private Map<Response,User> answers;

    public MapObject() {}

    public MapObject(int id, String name, Map<Response,User> answers) {
        super();
        this.id = id;
        this.name = name;
        this.answers = answers;
    }

    public void displayInfo() {
        System.out.println("question id: " + id);
        System.out.println("question name " + name);
        System.out.println("Answers...");
        Set<Map.Entry<Response,User>> set = answers.entrySet();
        Iterator<Map.Entry<Response,User>> itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry<Response, User> entry = itr.next();
            Response answer = entry.getKey();
            User user = entry.getValue();
            System.out.println("Answer Information:");
            System.out.println(answer);
            System.out.println("Posted By: ");
            System.out.println(user);
        }
    }
}
